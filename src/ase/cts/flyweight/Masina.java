package ase.cts.flyweight;

public abstract class Masina {
    String roti;
    String exterior;
    String sigla;
    String culoare;

    public Masina(String culoare) {
        this.culoare = culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    abstract void afiseaza();
}
