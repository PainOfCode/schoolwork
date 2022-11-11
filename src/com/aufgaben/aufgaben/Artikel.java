package com.aufgaben.aufgaben;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Artikel {
    private static long zaehler = (long) (Math.random() * 3579577L);
    private long artikelNr;
    private String artikelName;
    private int bestand;
    private BigDecimal einkaufspreis;
    private char warengruppe;
    private boolean auslaufartikel;
    private Lieferant lieferant;

    public Artikel(String artikelName, int bestand, BigDecimal einkaufspreis, char warengruppe, boolean auslaufartikel) {
        this.artikelNr = zaehler;
        this.artikelName = artikelName;
        this.bestand = bestand;
        this.einkaufspreis = einkaufspreis.setScale(2, RoundingMode.HALF_UP);
        this.warengruppe = warengruppe;
        this.auslaufartikel = auslaufartikel;
        this.lieferant = new Lieferant();
        //zaehler++;
        zaehler += (long) (Math.random() * 3579577L);
    }

    public Artikel(String artikelName, int bestand, BigDecimal einkaufspreis, char warengruppe, boolean auslaufartikel, Lieferant lieferant) {
        this.artikelNr = zaehler;
        this.artikelName = artikelName;
        this.bestand = bestand;
        this.einkaufspreis = einkaufspreis.setScale(2, RoundingMode.HALF_UP);
        this.warengruppe = warengruppe;
        this.auslaufartikel = auslaufartikel;
        this.lieferant = lieferant;
        //zaehler++;
        zaehler += (long) (Math.random() * 3579577L);
    }

    public String toString() {

        return String.format(
                "Artikelnummerr: %s, Artikelname: %s, Bestand: %s, Einkaufspreis: %s, Warengruppe: %s, Auslaufartikel: %s, Lieferantenname: %s",
                artikelNr,
                artikelName,
                bestand,
                einkaufspreis,
                warengruppe,
                auslaufartikel,
                lieferant.getName()
        );
    }

    public long getArtikelNr() {
        return artikelNr;
    }

    public void setArtikelNr(long artikelNr) {
        this.artikelNr = artikelNr;
    }

    public String getArtikelName() {
        return artikelName;
    }

    public void setArtikelName(String artikelName) {
        this.artikelName = artikelName;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public BigDecimal getEinkaufspreis() {
        return einkaufspreis;
    }

    public void setEinkaufspreis(BigDecimal einkaufspreis) {
        this.einkaufspreis = einkaufspreis;
    }

    public char getWarengruppe() {
        return warengruppe;
    }

    public void setWarengruppe(char warengruppe) {
        this.warengruppe = warengruppe;
    }

    public boolean isAuslaufartikel() {
        return auslaufartikel;
    }

    public void setAuslaufartikel(boolean auslaufartikel) {
        this.auslaufartikel = auslaufartikel;
    }

    public Lieferant getLieferant() {
        return lieferant;
    }

    public void setLieferant(Lieferant lieferant) {
        this.lieferant = lieferant;
    }


}
