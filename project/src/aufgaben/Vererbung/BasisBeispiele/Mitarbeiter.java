package aufgaben.Vererbung.BasisBeispiele;

public class Mitarbeiter extends Person {

    private String abteilung;

    public Mitarbeiter(String name, String abteilung) {
        super(name);
        this.abteilung = abteilung;
    }

    @Override
    public String toString() {
        //return "Mitarbeiter: Name: " + super.getName() + ", Abteilung: " + abteilung;
        return super.toString() + ", Abteilung: " + abteilung;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
}
