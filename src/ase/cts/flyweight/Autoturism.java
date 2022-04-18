package ase.cts.flyweight;

public class Autoturism extends Masina {
    String suportBicicleta;

    public Autoturism(String culoare) {
        super(culoare);
        System.out.println("S-a construit un autoturism.");
    }

    @Override
    void afiseaza() {
        System.out.println("Autoturism " + this.culoare + ".");
    }
}
