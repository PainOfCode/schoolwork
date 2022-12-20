package auswahl;

import aufgaben.Beispiele.ArrayUebungen;
import aufgaben.Beispiele.KlassenUebungen;
import aufgaben.Lagerverwaltung.IO;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayUebungen arrayUebungen = new ArrayUebungen();
        KlassenUebungen klassenUebungen = new KlassenUebungen();
        IO io = new IO(sc);
        aufgaben.Vererbung.BasisBeispiele.IO ioLager = new aufgaben.Vererbung.BasisBeispiele.IO();
        aufgaben.Vererbung.OnlineShop.IO ioOnline = new aufgaben.Vererbung.OnlineShop.IO();

        sc.useDelimiter("\n");

        //io2.aufgabe();

        //System.out.println(stringBuilder);
        ioOnline.aufgabe1();

        sc.close();
    }

}