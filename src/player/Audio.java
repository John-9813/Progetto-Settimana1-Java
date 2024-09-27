package player;

public class Audio extends ElementoMultimediale {
    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        volume--;
    }

    // Metodo per riprodurre l'audio facendo override
    @Override
    public void esegui() { // Utilizzo del metodo astratto
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}

