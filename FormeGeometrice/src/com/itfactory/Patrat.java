package com.itfactory;

public class Patrat {
    private double laturaPatratului;

    Patrat(double laturaPatratului){
        this.laturaPatratului = laturaPatratului;
    }
    public double perimetrulPatratului(){
        return 4*laturaPatratului;
    }
    public double ariaPatratului(){
        return laturaPatratului*laturaPatratului;
    }


}
