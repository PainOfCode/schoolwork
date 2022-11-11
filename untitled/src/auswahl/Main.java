package auswahl;

import aufgaben.KlassenUebungen;
import aufgaben.ArrayUebungen;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayUebungen arrayUebungen = new ArrayUebungen();
        KlassenUebungen klassenUebungen = new KlassenUebungen();

        sc.useDelimiter("\n");

        klassenUebungen.aufgabe4();

        sc.close();
    }

}