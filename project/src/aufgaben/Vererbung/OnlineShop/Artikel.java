package aufgaben.Vererbung.OnlineShop;

import java.math.BigDecimal;

public class Artikel {

    private int id;

    private String bezeichnung;

    private BigDecimal preis;

    public Artikel(int id, String bezeichnung, BigDecimal preis) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public int getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public BigDecimal getPreis() {
        return preis;
    }

    public void setPreis(BigDecimal preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Bezeichnung: %s, Preis: %s€", id, bezeichnung, preis);
    }
}
