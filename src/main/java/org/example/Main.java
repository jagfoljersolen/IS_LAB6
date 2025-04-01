package org.example;


public class Main {
    public static void main(String[] args) {
        try {

            String temp_url = "http://localhost/IS_LAB6_REST/cities/read";
            CityView view = new CityView();
            CityController controller = new CityController(view);
            controller.fetchAndDisplayCities(temp_url);

        } catch (Exception e) {
            System.err.println("Wystąpił nieoczekiwany błąd!!! ");
            e.printStackTrace(System.err);
        }
    }
}