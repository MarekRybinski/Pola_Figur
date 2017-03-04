package com.sdajava.if_lekcja2;

import java.util.Scanner;

public class Pola {
    public float a, b;

    public Pola(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float kwadrat() {
        return a * a;
    }

    public float prostokat() {
        return a * b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setAB(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public double kolo() {
        return a * a * 3.14;
    }



        public void Czytaj_Dane () {
            System.out.println("Podaj a i b:" );
            Scanner wejscie = new Scanner(System.in);

            this.a = wejscie.nextFloat();
            this.b = wejscie.nextFloat();
            if((a==0) || (b == 0)){
                System.out.println("Zero!!!");
            }
        }

}


