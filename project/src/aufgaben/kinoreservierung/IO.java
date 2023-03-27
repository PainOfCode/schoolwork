package aufgaben.kinoreservierung;

import java.util.Scanner;

public class IO {

    public void aufgaben(Scanner sc) {

        boolean[][] sitzplan = Raumverwaltung.erstelleSitzplan(25);
        Raumverwaltung.druckeSitzplan(sitzplan);

        int sitzplatz = Raumverwaltung.fineSitzplaetzeInReihe(sitzplan, 7);
        System.out.println("Sitzplatz-Kette: " + sitzplatz);
        Raumverwaltung.druckeSitzplan(sitzplan);

        int sitzplatzReiheOnly = Raumverwaltung.fineSitzplaetzeInReihe(sitzplan, 3, 8);
        System.out.println("Sitzplatz-Kette fuer Reihe: " + sitzplatzReiheOnly);
        Raumverwaltung.druckeSitzplan(sitzplan);

    }

}
