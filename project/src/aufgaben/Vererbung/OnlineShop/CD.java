package aufgaben.Vererbung.OnlineShop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CD extends Artikel {

    private String label;

    private String genre;

    private BigDecimal spieldauerInSekunden;

    public CD(int id, String bezeichnung, BigDecimal preis, String label, String genre, BigDecimal spieldauerInSekunden) {
        super(id, bezeichnung, preis);
        this.label = label;
        this.genre = genre;
        this.spieldauerInSekunden = spieldauerInSekunden;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, Label: %s, Genre: %s, Spieldauer: %s",
                super.toString(),
                label,
                genre,
                spieldauerInSekunden.divide(new BigDecimal("60"), RoundingMode.FLOOR).intValue() + ":" + spieldauerInSekunden.intValue() % 60);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BigDecimal getSpieldauerInSekunden() {
        return spieldauerInSekunden;
    }

    public void setSpieldauerInSekunden(BigDecimal spieldauerInSekunden) {
        this.spieldauerInSekunden = spieldauerInSekunden;
    }
}
