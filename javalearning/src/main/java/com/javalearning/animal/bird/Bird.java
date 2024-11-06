package com.javalearning.animal.bird;

import com.javalearning.animal.Animal;

public class Bird extends Animal{
    protected boolean feather;
    protected boolean canFly;
    
    
    public Bird() {
        this.feather = true;
        this.canFly = true;
    }



    public String toShow() {
        return "Bird [heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", feather=" + feather
                + ", animalType=" + animalType + ", canFly=" + canFly + ", bloodType=" + bloodType + "]";
    }

    
    
}
