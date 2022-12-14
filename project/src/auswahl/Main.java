package auswahl;

import aufgaben.ArrayUebungen;
import aufgaben.KlassenUebungen;
import aufgaben.Lagerverwaltung.IO;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayUebungen arrayUebungen = new ArrayUebungen();
        KlassenUebungen klassenUebungen = new KlassenUebungen();
        IO io = new IO(sc);

        sc.useDelimiter("\n");

        io.aufgabe();

        sc.close();
    }

}