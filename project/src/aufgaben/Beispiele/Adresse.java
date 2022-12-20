package aufgaben.Beispiele;

public class Adresse {
    private String strasse;
    private String hausnummer;
    private String plz;
    private String stadt;

    public Adresse(String strasse, String hausnummer, String plz, String stadt) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
    }

    public Adresse() {
        this.strasse = null;
        this.hausnummer = null;
        this.plz = null;
        this.stadt = null;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    @Override
    public String toString() {
        return "Adresse { " +
                "strasse = '" + strasse + '\'' +
                ", hausnummer = '" + hausnummer + '\'' +
                ", plz = '" + plz + '\'' +
                ", stadt = '" + stadt + '\'' +
                "}";
    }
}
