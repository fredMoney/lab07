package ase.cts.decorator;

public class MasinaInteligentaDecorator extends MasinaDecorator {
    public MasinaInteligentaDecorator(Masina masina) {
        super(masina);
    }

    public void pornesteMotorul() {
        decoratedMasina.pornesteMotorul();
        this.incalzesteScaunele();
    }

    private void incalzesteScaunele() {
        System.out.println("Scaunele se incalzesc.");
    }
}
