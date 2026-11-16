package org.example;

public class Main {
    public static void main(String[] args) {
    VeicoloFactory factory = new VeicoloFactory(); //creazione oggetto classe factory

    Veicolo auto = factory.crea("auto");
    Veicolo moto = factory.crea("moto");

        System.out.println("Ruote auto: " + auto.ruote());

        System.out.println("Ruote moto: " + moto.ruote());
}
}