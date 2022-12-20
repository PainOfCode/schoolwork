package aufgaben.Vererbung.BasisBeispiele;

public class IO {

    public void aufgabe() {

        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Günter", "EDV");
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Sabine", "IBR");

        Kunde kunde1 = new Kunde("Dennis", 55);
        Kunde kunde2 = new Kunde("Peter", 666);

        System.out.println("1. Mitarbeiter" + mitarbeiter1);
        System.out.println("2. Mitarbeiter" + mitarbeiter2);
        System.out.println("1. Kunde" + kunde1);
        System.out.println("2. Kunde" + kunde2);

        mitarbeiter1.setName("Rudolph");
        mitarbeiter1.setAbteilung("Scanning");
        mitarbeiter2.setName("Thomas");
        mitarbeiter2.setAbteilung("Leitung");

        kunde1.setName("Kadelka");
        kunde1.setKundenID(666);
        kunde2.setName("Steven");
        kunde2.setKundenID(42);

        System.out.println("1. Mitarbeiter" + mitarbeiter1);
        System.out.println("2. Mitarbeiter" + mitarbeiter2);
        System.out.println("1. Kunde" + kunde1);
        System.out.println("2. Kunde" + kunde2);
    }

}
