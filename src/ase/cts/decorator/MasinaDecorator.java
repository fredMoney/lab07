package ase.cts.decorator;

public abstract class MasinaDecorator implements Masina {
    protected Masina decoratedMasina;

    public MasinaDecorator(Masina masina) {
        this.decoratedMasina = masina;
    }

    @Override
    public void pornesteMotorul() {
        decoratedMasina.pornesteMotorul();
    }
}
