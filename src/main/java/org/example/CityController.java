package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityController {
    private final CityView view;

    public CityController(CityView view) {
        this.view = view;
    }

    public void fetchAndDisplayCities(String temp_url) {
        try {
            System.out.println("Wysyłanie zapytania...");
            URL url = new URL(temp_url);
            InputStream is = url.openStream();
            System.out.println("Pobieranie odpowiedzi...");
            String source = new BufferedReader(new InputStreamReader(is))
                    .lines().collect(Collectors.joining("\n"));
            System.out.println("Przetwarzanie danych...");
            JSONObject json = new JSONObject(source);
            JSONArray recieveddata = (JSONArray)json.get("cities");

            List<City> cities = new ArrayList<>();
            for (Object o : recieveddata) {
                JSONObject cityJson = (JSONObject)o;
                City city = new City(
                        cityJson.getString("Name"),
                        cityJson.getString("CountryCode"),
                        cityJson.getString("District"),
                        cityJson.getInt("Population")
                );
                cities.add(city);
            }
            for (City city : cities) {
                view.displayCityDetails(city);
            }

        } catch (Exception e) {
            System.err.println("Wystąpił nieoczekiwany błąd!!! ");
            e.printStackTrace(System.err);
        }
    }

}
