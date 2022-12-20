package aufgaben.Vererbung.OnlineShop;

import java.math.BigDecimal;

public class Kleidung extends Artikel {

    private String material;

    private BigDecimal stoffdicke;

    private String groesse;

    public Kleidung(int id, String bezeichnung, BigDecimal preis, String material, BigDecimal stoffdicke, String groesse) {
        super(id, bezeichnung, preis);
        this.material = material;
        this.stoffdicke = stoffdicke;
        this.groesse = groesse;
    }

    @Override
    public String toString() {
        return String.format("%s, Material: %s, Stoffdicke: %smm, Größe: %s", super.toString(), material, stoffdicke, groesse);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public BigDecimal getStoffdicke() {
        return stoffdicke;
    }

    public void setStoffdicke(BigDecimal stoffdicke) {
        this.stoffdicke = stoffdicke;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }
}
