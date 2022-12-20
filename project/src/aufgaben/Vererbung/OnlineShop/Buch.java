package aufgaben.Vererbung.OnlineShop;

import java.math.BigDecimal;

public class Buch extends Artikel {

    private String isbn;

    private String verlag;

    private int seitenanzahl;

    public Buch(int id, String bezeichnung, BigDecimal preis, String isbn, String verlag, int seitenanzahl) {
        super(id, bezeichnung, preis);
        this.isbn = isbn;
        this.verlag = verlag;
        this.seitenanzahl = seitenanzahl;
    }

    @Override
    public String toString() {
        return String.format("%s, ISBN: %s, Verlag: %s, Seitenanzahl: %s", super.toString(), isbn, verlag, seitenanzahl);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }
}
