package com.javalearning.animal.fish;

public class Eel extends Fish {
    
    protected String sprecial;

    public Eel() {
        super();
        this.sprecial ="Release Electric Schock" ;
    }

    public String toShow() {
        return "Eel [heightInFeet=" + heightInFeet + ", sprecial=" + sprecial + ", weightInKilos=" + weightInKilos
                + ", waterBone=" + waterBone + ", animalType=" + animalType + ", gills=" + gills + ", bloodType="
                + bloodType + "]";
    }

}
