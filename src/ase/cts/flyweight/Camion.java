package ase.cts.flyweight;

public class Camion extends Masina {
    String remorca;

    public Camion(String culoare) {
        super(culoare);
        System.out.println("S-a construit un camion.");
    }

    @Override
    void afiseaza() {
        System.out.println("Camion " + this.culoare + ".");
    }
}
