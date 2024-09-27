package player;

public class Video extends ElementoMultimediale {
    private int volume;
    private int durata;
    private int luminosita;

    public Video(String titolo, int volume, int durata, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    // Metodo per riprodurre il video facendo override
    @Override
    public void esegui() { // Utilizzo del metodo astratto
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }
}

