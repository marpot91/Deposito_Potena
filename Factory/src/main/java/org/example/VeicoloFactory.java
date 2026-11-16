package org.example;

public class VeicoloFactory {

    public Veicolo crea(String tipo) {

        switch (tipo) {

            case "auto":
                return new Auto();

            case "moto":
                return new Moto();

            default:
                throw new IllegalArgumentException("Veicolo non valido");
        }
    }
}
