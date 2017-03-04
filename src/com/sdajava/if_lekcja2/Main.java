package com.sdajava.if_lekcja2;

public class Main {

    public static void main(String[] args) {
        float x =13;
        Pola kwadrat = new Pola(2, 9);
        Pola kwadrat1 = new Pola(12, 9);
        Pola prostokat = new Pola(2, 9);
        Pola prostokat1 = new Pola(2, 9);
        Pola kolo = new Pola(4, 0);
        Pola kolo1 = new Pola(4, 0);
        Pola kolo2 = new Pola(4, 0);
        kwadrat1.setA(90);
        prostokat.setA(89);
        prostokat.setB(98);
        kolo.setA(x);
        kolo1.setA(5);
        kolo2.setA(13);
        prostokat1.setAB(3, 5);

      //  System.out.println(kwadrat.kwadrat());

        System.out.println(prostokat.prostokat());
      //  System.out.println(prostokat1.prostokat());

        System.out.println(kwadrat1.kwadrat());

        System.out.println(kolo.kolo());
      //  System.out.println(kolo1.kolo());
       // System.out.println(kolo2.kolo());



     //  System.out.println(kwadrat1.getA());

        kwadrat.Czytaj_Dane();
        System.out.println( kwadrat.kwadrat());
        kwadrat1.Czytaj_Dane();
        System.out.println( kwadrat1.kwadrat());
        prostokat.Czytaj_Dane();
        System.out.println( prostokat.prostokat());
    }
}
