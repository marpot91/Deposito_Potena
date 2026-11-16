 
public class Cioccolatino extends Cioccolato {

    private String forma;
    private String ripieno;
    private String aggiunte;

    
    public Cioccolatino(String tipoCioccolato, double percentualeCacao,
                        String forma, String ripieno, String aggiunte) {

        super(tipoCioccolato, percentualeCacao);

        this.forma = forma;
        this.ripieno = ripieno;
        this.aggiunte = aggiunte;
    }

    
}
