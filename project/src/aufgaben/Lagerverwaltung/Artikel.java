package aufgaben.Lagerverwaltung;

import java.math.BigDecimal;

public class Artikel {

    private int id;

    private String name;

    private int vorrat;

    private BigDecimal einzelpreis;

    public Artikel(int id, String name, int vorrat, BigDecimal einzelpreis) {
        this.id = id;
        this.name = name;
        this.vorrat = vorrat;
        this.einzelpreis = einzelpreis;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVorrat() {
        return vorrat;
    }

    public void setVorrat(int vorrat) {
        this.vorrat = vorrat;
    }

    public BigDecimal getEinzelpreis() {
        return einzelpreis;
    }

    public void setEinzelpreis(BigDecimal einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Vorrat: %s, Einzelpreis: %s", id, name, vorrat, einzelpreis);
    }
}
