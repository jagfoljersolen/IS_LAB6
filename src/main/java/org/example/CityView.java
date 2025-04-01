package org.example;

public class CityView {
    public void displayCityDetails(City city) {
        System.out.println("City name: " + city.getName());
        System.out.println("Country code: " + city.getCountryCode());
        System.out.println("District: " + city.getDistrict());
        System.out.println("Population: " + city.getPopulation());
        System.out.println("-----------------------------------");
    }
}
