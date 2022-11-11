package com.aufgaben.aufgaben;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KlassenUebungen {

    public void aufgabe1() {

        Artikel testArtikel1 = new Artikel("Wasser", 55, new BigDecimal("0.25"), 'F', false);
        Artikel testArtike2 = new Artikel("Brot", 300, new BigDecimal("5.25"), 'N', true);

        System.out.println("Erster Artikel:\n\t" + testArtikel1);
        System.out.println("Zweiter Artikel:\n\t" + testArtike2);

        /*
        testArtikel1.setArtikelName("Hello");
        testArtike2.setArtikelName("Overwrite");

        System.out.println("Erster Artikel:\n\t" + testArtikel1);
        System.out.println("Zweiter Artikel:\n\t" + testArtike2);
        */
    }

    public void aufgabe2() {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter(123456L, "Lisa", "Mona", LocalDate.of(1992, 2, 24), new BigDecimal("4334.56"));
        Mitarbeiter mitarbeiter2 = new Mitarbeiter(654321L, "Günter", "Ruff", LocalDate.of(1955, 3, 17), new BigDecimal("8668.33"));

        System.out.println(mitarbeiter1);
        System.out.println(mitarbeiter2);

        mitarbeiter1.setName("New name");
        mitarbeiter2.setMonatsgehalt(new BigDecimal("1337.42"));

        System.out.println(mitarbeiter1);
        System.out.println(mitarbeiter2);
    }

    public void aufgabe3(Scanner sc) {

        Kraftstoffverbrauch kraftstoffverbrauch1 = new Kraftstoffverbrauch(LocalDate.of(2022, 9, 20), new BigDecimal("58"), new BigDecimal("1.89"), new BigDecimal("891"));
        Kraftstoffverbrauch kraftstoffverbrauch2 = new Kraftstoffverbrauch(LocalDate.of(2022, 9, 21), new BigDecimal("63"), new BigDecimal("1.87"), new BigDecimal("1014"));

        System.out.println(kraftstoffverbrauch1);
        System.out.println(kraftstoffverbrauch2);

        System.out.println("\n");

        System.out.println("1 datum: " + kraftstoffverbrauch1.getDatum().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println("1 getankt: " + kraftstoffverbrauch1.getGetankt());
        System.out.println("1 PPL: " + kraftstoffverbrauch1.getPreisProLiter());
        System.out.println("1 gefahren: " + kraftstoffverbrauch1.getGefahren());

        System.out.println("\n");

        System.out.println("k1 durchschnitt: " + kraftstoffverbrauch1.durchschnitt());
        System.out.println("k1 PPLP100: " + kraftstoffverbrauch1.krafstoffkostenPro100());
        System.out.println("k2 durchschnitt: " + kraftstoffverbrauch2.durchschnitt());
        System.out.println("k2 PPLP100: " + kraftstoffverbrauch2.krafstoffkostenPro100());

        System.out.println("\n");

        kraftstoffverbrauch1.setDatum(LocalDate.of(1999, 11, 11));
        kraftstoffverbrauch1.setGefahren(new BigDecimal("300"));
        kraftstoffverbrauch1.setGetankt(new BigDecimal("30"));
        kraftstoffverbrauch1.setPreisProLiter(new BigDecimal("2.0"));

        System.out.println(kraftstoffverbrauch1);
        System.out.println("k1 durchschnitt: " + kraftstoffverbrauch1.durchschnitt());
        System.out.println("k1 PPLP100: " + kraftstoffverbrauch1.krafstoffkostenPro100());


        System.out.println("\n");

        kraftstoffverbrauch1 = new Kraftstoffverbrauch(new BigDecimal("20"), new BigDecimal("2.0"), new BigDecimal("400"));

        System.out.println(kraftstoffverbrauch1 + "\n");

        System.out.println("Durchschnittverbrauch pro 100km: \t" + kraftstoffverbrauch1.durchschnitt());
        System.out.println("Durchschnittverbrauch pro 50km: \t" + kraftstoffverbrauch1.durchschnitt(new BigDecimal("50")));
        System.out.println("PPLP100: \t\t\t\t\t\t\t" + kraftstoffverbrauch1.durchschnitt());
        System.out.println("PPLP050: \t\t\t\t\t\t\t" + kraftstoffverbrauch1.durchschnitt(new BigDecimal("50")));

    }

    public void aufgabe4() {

        Adresse adresse = new Adresse("Hallostr", "12a", "53441", "Empty");
        Lieferant lieferant = new Lieferant(adresse, 66, "Günter");

        Artikel artikel = new Artikel("Brot", 300, new BigDecimal("5.25"), 'N', true, lieferant);

        System.out.println("Artkel-Print: \n" + artikel);

        Artikel artikel2 = new Artikel("Brot", 300, new BigDecimal("5.25"), 'N', true);

        System.out.println("\nArtkel-Print-2: \n" + artikel2);
    }

}
