package com.aufgaben.aufgaben;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mitarbeiter {

    private long personalnummer;
    private String name;
    private String vorname;
    private LocalDate geburtsdatum;
    private BigDecimal monatsgehalt;

    public Mitarbeiter(long personalnummer, String name, String vorname, LocalDate geburtsdatum, BigDecimal monatsgehalt) {
        this.personalnummer = personalnummer;
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.monatsgehalt = monatsgehalt;
    }

    public String toString() {
        return String.format("Personalnummer: %s, Name: %s, Vorname: %s, Geburtsdatum: %s, Monatsgehalt: %s€",
                personalnummer,
                name,
                vorname,
                geburtsdatum.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                monatsgehalt
        );
    }

    public long getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(long personalnummer) {
        this.personalnummer = personalnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public BigDecimal getMonatsgehalt() {
        return monatsgehalt;
    }

    public void setMonatsgehalt(BigDecimal monatsgehalt) {
        this.monatsgehalt = monatsgehalt;
    }
}
