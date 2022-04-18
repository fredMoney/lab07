package ase.cts.flyweight;

import java.util.HashMap;

public class MasinaFactory {
    HashMap<TipMasina, Masina> mapMasini =
            new HashMap<TipMasina, Masina>();

    Masina getMasina(TipMasina tipMasina, String culoare) {
        if(mapMasini.containsKey(tipMasina)) {
            mapMasini.get(tipMasina).setCuloare(culoare);
        } else {
            switch (tipMasina) {
                case Autoturism -> mapMasini.put(TipMasina.Autoturism, new Autoturism(culoare));
                case Camion -> mapMasini.put(TipMasina.Camion, new Camion(culoare));
            }
        }
        return mapMasini.get(tipMasina);
    }
}
