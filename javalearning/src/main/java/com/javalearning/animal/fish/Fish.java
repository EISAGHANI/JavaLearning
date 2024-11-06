package com.javalearning.animal.fish;

import com.javalearning.animal.Animal;

public class Fish extends Animal{
    
    protected boolean waterBone;
    protected boolean gills;
    
    public Fish() {
        animalType = "fish";
        this.waterBone = true;
        this.gills = true;
    }

    public String toShow() {
        return "Fish [heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", waterBone=" + waterBone
                + ", animalType=" + animalType + ", bloodType=" + bloodType + ", gills=" + gills + "]";
    }

    
    
}
