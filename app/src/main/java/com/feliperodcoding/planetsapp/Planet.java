package com.feliperodcoding.planetsapp;

public class Planet {

    private String planetName;
    private String mooncount;

    private int planetImage;

    public Planet(String planetName, String mooncount, int planetImage) {
        this.planetName = planetName;
        this.mooncount = mooncount;
        this.planetImage = planetImage;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMooncount() {
        return mooncount;
    }

    public void setMooncount(String mooncount) {
        this.mooncount = mooncount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
