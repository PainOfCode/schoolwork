package aufgaben.Vererbung.BasisBeispiele;

public class Kunde extends Person {

    private int kundenID;

    public Kunde(String name, int kundenID) {
        super(name);
        this.kundenID = kundenID;
    }

    public int getKundenID() {
        return kundenID;
    }

    @Override
    public String toString() {
        //return "Kunde: Name: " + super.getName() + ", ID: " + kundenID;
        return super.toString() + ", KundenID: " + kundenID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
    }
}
