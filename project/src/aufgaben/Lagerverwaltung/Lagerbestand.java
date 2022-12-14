package aufgaben.Lagerverwaltung;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Lagerbestand {

    private List<Artikel> artikelList = new ArrayList<>();

    private int grenze;

    public Lagerbestand(int obergrenze) {
        this.grenze = obergrenze;
    }

    public void addArtikel(Artikel artikel) {

        if (artikelList.size() < grenze) {
            artikelList.add(artikel);

        } else {

            System.out.println("Artikel konnte nicht hinzugefuegt werden, da die Liste voll ist");

        }

    }

    public List<Artikel> getArtikelList() {
        return this.artikelList;
    }

    public int getGesamtbestand() {
        int cc = 0;

        for (Artikel art : artikelList) {
            cc = cc + art.getVorrat();
        }

        return cc;
    }

    public BigDecimal getGesamtwert() {
        BigDecimal sum = BigDecimal.ZERO;

        for (Artikel art : artikelList) {
            sum = sum.add(new BigDecimal(art.getVorrat()).multiply(art.getEinzelpreis()))
                    .setScale(2, RoundingMode.HALF_UP);
        }

        return sum;
    }

    public void removeArtikel(Artikel artikel) {

        if (artikelList.contains(artikel)) {
            artikelList.remove(artikel);
        }

    }

    public void removeArtikel(int artId) {

        artikelList.removeIf(art -> art.getId() == artId);

    }

}
