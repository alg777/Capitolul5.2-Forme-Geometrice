package com.itfactory;

public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
    public double perimetrulDreptunghiului(){
        return 2*(lungime+latime);
    }
    public double ariaDreptunghiului(){
        return lungime*latime;
    }
}

