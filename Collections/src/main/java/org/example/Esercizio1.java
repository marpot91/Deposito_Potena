package org.example;

public class Esercizio1 {
    public static void main(String[] args) {


        double[] temperature = {12.5, 15.0, 9.8, 18.2, 14.0, 11.3, 16.7};

        double max = temperature[0];
        int giorno = 0;

        for (int i = 0; i < 7; i++) {

            if (temperature[i] > max) {
                max = temperature[i];
                giorno = i;
            }
        }

        System.out.println("Temperatura massima: " + max);
        System.out.println("Giorno: " + (giorno));
    }
}