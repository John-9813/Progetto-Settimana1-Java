package player;

public abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // Metodo astratto che verrà implementato nelle classi figlie
    public abstract void esegui();
}
