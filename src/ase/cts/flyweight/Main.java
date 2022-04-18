package ase.cts.flyweight;

public class Main {
    public static void main(String[] args) {
        MasinaFactory factory = new MasinaFactory();

        Masina autoR = factory.getMasina(TipMasina.Autoturism, "rosu");
        autoR.afiseaza();

        Masina autoG = factory.getMasina(TipMasina.Autoturism, "galben");
        autoG.afiseaza();

        Masina autoV = factory.getMasina(TipMasina.Autoturism, "verde");
        autoV.afiseaza();

        Masina camV = factory.getMasina(TipMasina.Camion, "verde");
        camV.afiseaza();

        Masina camG = factory.getMasina(TipMasina.Camion, "galben");
        camG.afiseaza();

        Masina camR = factory.getMasina(TipMasina.Camion, "rosu");
        camR.afiseaza();
    }
}
