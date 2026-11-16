package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Esercizio3 {

    public static void main(String[] args) {

    Map<String, Double> incassiordineAlfabetico = new TreeMap<>();

    // LinkedHashMap: mantiene l'ordine in cui vengono inseriti i dati.
    Map<String, Double> incassiordineArrivo = new LinkedHashMap<>();

    // Inserimento degli incassi
        incassiordineAlfabetico.put("Il Signore Degli Anelli", 1500.0);
        incassiordineAlfabetico.put("Harry Potter", 1200.0);
        incassiordineAlfabetico.put("Spiderman", 900.0);
        incassiordineAlfabetico.put("Avengers", 1800.0);

        incassiordineArrivo.put("Il Signore Degli Anelli", 1500.0);
        incassiordineArrivo.put("Harry Potter", 1200.0);
        incassiordineArrivo.put("Spiderman", 900.0);
        incassiordineArrivo.put("Avengers", 1800.0);

        System.out.println("Ordine alfabetico:");
        System.out.println(incassiordineAlfabetico);

        System.out.println("Ordine di arrivo:");
        System.out.println(incassiordineArrivo);
}


}
