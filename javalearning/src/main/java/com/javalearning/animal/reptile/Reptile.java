package com.javalearning.animal.reptile;

import com.javalearning.animal.Animal;

public class Reptile extends Animal{
    protected String skin, egg;
    protected boolean backbone;

    
    public Reptile() {
        heightInFeet = 5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry Skin";
        this.egg = "soft shelled";
        this.backbone = true;
    }

    public String showInfo() {
        return "Reptile [heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", skin=" + skin
                + ", egg=" + egg + ", animalType=" + animalType + ", backbone=" + backbone + ", bloodType=" + bloodType
                + "]";
    }

    
    
}
