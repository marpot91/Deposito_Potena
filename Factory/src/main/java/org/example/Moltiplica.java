package org.example;

public class Moltiplica implements Comando {

    @Override
    public String esegui(int a, int b) {

        return "Risultato: " + (a * b);
    }
}