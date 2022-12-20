package aufgaben.Beispiele;

public class Lieferant {
    private Adresse adresse;
    private int id;
    private String name;

    public Lieferant(Adresse adresse, int id, String name) {
        this.adresse = adresse;
        this.id = id;
        this.name = name;
    }

    public Lieferant() {
        this.adresse = new Adresse();
        this.name = null;
        this.id = -4;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Lieferant { " +
                "adresse = " + adresse +
                ", id = " + id +
                ", name = '" + name + '\'' +
                "}";
    }
}
