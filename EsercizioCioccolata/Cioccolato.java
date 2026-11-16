
public class Cioccolato {

    // Proprietà comuni
     String tipoCioccolato;
     double percentualeCacao;

    // Limite massimo giornaliero
    public static final int MAX = 100;

    // Costruttore
    public Cioccolato(String tipoCioccolato, double percentualeCacao) {
        this.tipoCioccolato = tipoCioccolato;
        this.percentualeCacao = percentualeCacao;
    }

    // Metodo di produzione
    public void produce() {
        System.out.println("Tipo cioccolato: " + tipoCioccolato);
        System.out.println("Percentuale cacao: " + percentualeCacao + "%");
        System.out.println("Produzione massima giornaliera: " + MAX);
    }
}
