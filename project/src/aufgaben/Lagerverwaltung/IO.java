package aufgaben.Lagerverwaltung;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IO {

    private Scanner sc;

    public IO(Scanner sc) {
        this.sc = sc;
    }

    private List<Artikel> artikelliste = new ArrayList<>();
    private Lagerbestand lagerbestand = new Lagerbestand(6);

    public void aufgabe() {

        boolean exit = false;
        while (!exit) {
            print("\n\n");
            exit = selectionMenu();
        }

    }

    private boolean selectionMenu() {

        print("Was wollen Sie machen?");
        print("1. Artikel hinzufuegen");
        print("2. Lagerbestand auflisten");
        print("3. Artikel zum Lagerbestand hinzufügen");
        print("4. Artikel vom Lagerbestand entfernen");
        print("5. Artikel anpassen");
        print("6. Beenden");
        int selection = sc.nextInt();

        print("\n\n");

        switch (selection) {
            case 1:
                batchAddArtikel();
                break;
            case 2:
                printBestand();
                break;
            case 3:
                addArtikelToLagerbestand();
                break;
            case 4:
                removeArtikelFromLagerbestand();
                break;
            case 5:
                changeAttributes();
                break;
            default:
                return true;
        }

        return false;
    }

    private void batchAddArtikel() {
        boolean exit;

        print("Artikel erstellen und zum Lagerbestand hinzufuegen");
        do {

            print("ArtID: ");
            int artId = sc.nextInt();

            print("ArtName: ");
            String artName = sc.next();

            print("Vorrätig: ");
            int vorrat = sc.nextInt();

            print("Einzelpreis: ");
            BigDecimal einzelpreis = new BigDecimal(sc.next());

            Artikel artikel = new Artikel(artId, artName, vorrat, einzelpreis);
            artikelliste.add(artikel);

            print("Artikel hinzufügen?");
            boolean hinzufuegen = sc.nextBoolean();

            if (hinzufuegen) {
                lagerbestand.addArtikel(artikel);
            }

            print("Durchgang beenden?");
            exit = sc.nextBoolean();

        } while (!exit);
    }

    private void print(Object obj) {
        System.out.println(obj);
    }

    private void printBestand() {

        List<Artikel> artikelList = lagerbestand.getArtikelList();

        print("ArtID\t\tArtikelname\t\t\tBestand\tEinzelpreis\t\t");
        for (int i = 0; i < artikelList.size(); i++) {

            print((i + 1) + ". Artikel: " + artikelliste.get(i));

        }

        print("Gesamtbestand: " + lagerbestand.getGesamtbestand());
        print("Gesamtwert: " + lagerbestand.getGesamtwert().setScale(2, RoundingMode.HALF_UP));

    }

    private void removeArtikelFromLagerbestand() {

        for (int i = 0; i < lagerbestand.getArtikelList().size(); i++) {

            print((i + 1) + ". Artikel: " + lagerbestand.getArtikelList().get(i));

        }

        print("Artikel zum entfernen: ");
        int auswahl = sc.nextInt();

        lagerbestand.removeArtikel(lagerbestand.getArtikelList().get(auswahl - 1));

    }

    private void addArtikelToLagerbestand() {

        for (int i = 0; i < artikelliste.size(); i++) {

            print((i + 1) + ". Artikel: " + artikelliste.get(i));

        }

        print("Artikel zum hinzufügen: ");
        int auswahl = sc.nextInt();

        lagerbestand.addArtikel(artikelliste.get(auswahl - 1));

    }

    private void changeAttributes() {

        for (int i = 0; i < artikelliste.size(); i++) {

            print((i + 1) + ". Artikel: " + artikelliste.get(i));

        }

        print("Artikel zum hinzufügen: ");
        int auswahl = sc.nextInt();

        Artikel art = artikelliste.get(auswahl - 1);

        print("Welches Attribut soll geändert werden?");
        print("1. Name");
        print("2. Vorrat");
        print("3. Einzelpreis ");

        switch (sc.nextInt()) {
            case 1:
                print("Neuer name: ");
                art.setName(sc.next());
                break;
            case 2:
                print("Neuer Vorrat: ");
                art.setVorrat(sc.nextInt());
                break;
            case 3:
                print("Neuer Einzelpreis");
                art.setEinzelpreis(new BigDecimal(sc.next()));
                break;
        }

    }

}
