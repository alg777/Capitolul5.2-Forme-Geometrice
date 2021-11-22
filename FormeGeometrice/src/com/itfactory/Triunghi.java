package com.itfactory;

public class Triunghi {
    private double latura1;
    private double latura2;
    private double latura3;

    public Triunghi(double latura1, double latura2, double latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }
    public double perimetrulTriunghiului(){
        return latura1+latura2+latura3;
    }
}

