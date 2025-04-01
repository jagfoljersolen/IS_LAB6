package org.example;

public class City {

    private String name;
    private String countryCode;
    private String district;
    private int population;

    public City(String name, String countryCode, String district, int population) {
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public String getName() {
        return name;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public String getDistrict() {
        return district;
    }
    public int getPopulation() {
        return population;
    }
}
