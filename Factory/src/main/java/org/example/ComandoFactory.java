package org.example;

import java.util.Optional;

public class ComandoFactory {

    public Optional<Comando> crea(String nome) {

        switch (nome) {

            case "somma":
                return Optional.of(new Somma());

            case "moltiplica":
                return Optional.of(new Moltiplica());

            default:
                return Optional.empty();
        }
    }
}
