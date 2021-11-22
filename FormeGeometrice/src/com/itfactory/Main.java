package com.itfactory;

public class Main {
        /*Problema 2-----------------------------------------------------------------------------------------------
    Creati un proiect cu titlul FormeGeometrice in care se cere sa se implementeze cerintele:
            1. Veti avea pachetul de baza com.itfactory
    TRIUNGHI:
            2. Se va crea o clasa Triunghi impreuna cu 3 proprietati, si anume laturile acestuia.
            (Pentru fiecare latura definiti un field in clasa)
            3. Constructorul va fi ales la alegere
            (Daca o sa implementati constructor cu parametri,
             nu va fie nevoie de setters si getters)
            4. Sa se creeze o metoda in clasa Triunghi care returneaza perimetrul triunghiului .
     PATRAT:
            5. Se va crea o clasa Patrat impreuna cu o proprietate care este dimensiunea unei laturi.
            6. Se cere sa se creeze doua metode in clasa, una care calculeaza perimetrul unui patrat,
             iar unul care calculeaza aria unui patrat.
     DREPTUNGHI:
            5. Se va crea o clasa Dreptunghi impreuna cu doua proprietati
            care reprezinta lungimea si latimea
            6. Se cere sa se creeze doua metode in clasa,
            una care calculeaza perimetrul unui dreptunghi,
            iar unul care calculeaza aria unui dreptunghi.

     ATENTE: Toate metodele create vor returna valorile calculate dupa caz.
     Se va crea o clasa Main unde va fi metoda main. In acea metoda main din clasa Main
     veti instantia obiectele cerute si veti folosi obiectele pentru a calcula, dupa caz,
     perimetrele, ariile.
     Se vor afisa tot in metoda main din clasa Main.*/

    public static void main(String[] args) {

        Triunghi triunghi = new Triunghi(3,4,5);
        Patrat patrat = new Patrat(12.5);
        Dreptunghi dreptunghi = new Dreptunghi(10, 4);

        double per3 = triunghi.perimetrulTriunghiului();
        double per4 = patrat.perimetrulPatratului();
        double aria4 = patrat.ariaPatratului();
        double perDreptunghi = dreptunghi.perimetrulDreptunghiului();
        double ariaDreptunghi = dreptunghi.ariaDreptunghiului();

        System.out.println("TRIUNGHIUL");
        System.out.println("Perimetrul: " + per3);
        System.out.println();

        System.out.println("PATRATUL");
        System.out.println("Perimetrul: " + per4);
        System.out.println("Aria: " + aria4);
        System.out.println();

        System.out.println("DREPTUNGHIUL");
        System.out.println("Perimetrul: " + perDreptunghi);
        System.out.println("Aria: " + ariaDreptunghi);
    }


}
