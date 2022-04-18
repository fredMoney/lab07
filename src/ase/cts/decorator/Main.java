package ase.cts.decorator;

public class Main {
    public static void main(String[] args) {
        Masina masina = new MasinaPersonala();
        Masina masinaInteligenta = new MasinaInteligentaDecorator(new MasinaPersonala());

        masina.pornesteMotorul();
        System.out.println("---------------");
        masinaInteligenta.pornesteMotorul();
    }
}
