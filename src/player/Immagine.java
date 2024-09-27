package player;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    // Metodo per visualizzare l'immagine facendo override
    @Override
    public void esegui() { // Utilizzo del metodo astratto
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }
}

