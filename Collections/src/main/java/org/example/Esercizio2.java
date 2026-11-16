package org.example;

import java.util.ArrayList;

public class Esercizio2 {



        public static void main(String[] args) {

            ArrayList<String> playlist = new ArrayList<>();

            playlist.add("Intro");
            playlist.add("Groove");
            playlist.add("Ballad");
            playlist.add("Finale");

            // Rimuovo il brano in posizione 2
            playlist.remove(2);

            // Inserisco Sorpresa in testa alla lista
            playlist.add(0, "Sorpresa");


            for (String brano : playlist) {
                System.out.println(brano);
            }

            System.out.println("Brani: " + playlist.size());
        }}

