package aufgaben.kinoreservierung;

import java.util.Random;

public class Raumverwaltung {

    private static final Random RANDOM = new Random(5);

    private static final int MAX_REIHEN = 9;

    private static final int MAX_SITZE_PRO_REIHE = 30;

    public static boolean[][] erstelleSitzplan(int zuBelegeneProzent) {
        boolean[][] sitzplan = new boolean[MAX_REIHEN][MAX_SITZE_PRO_REIHE];

        int belegtePlaetze = 0;
        int zuBelegenePlaetze = (zuBelegeneProzent * MAX_REIHEN * MAX_SITZE_PRO_REIHE) / 100;

        for (int reihe = 0; reihe < MAX_REIHEN; reihe++) {

            for (int sitz = 0; sitz < MAX_SITZE_PRO_REIHE; sitz++) {

                boolean belegt = RANDOM.nextBoolean();

                if (belegt) {
                    belegtePlaetze++;
                }

                if (belegtePlaetze >= zuBelegenePlaetze) {
                    sitzplan[reihe][sitz] = false;
                } else {
                    sitzplan[reihe][sitz] = belegt;
                }

            }

        }

        return sitzplan;
    }

    public static void druckeSitzplan(boolean[][] sitzplan) {

        System.out.println("Reihe\tSitznummern (B für belegt)");

        for (int reihe = 0; reihe < MAX_REIHEN; reihe++) {

            System.out.printf("%s:\t\t", reihe + 1);

            for (int sitz = 0; sitz < MAX_SITZE_PRO_REIHE; sitz++) {

                boolean belegt = sitzplan[reihe][sitz];

                if (sitz > 8) {
                    System.out.printf("%s%s %s\t", reihe + 1, sitz + 1, belegt ? "B" : "");
                } else {
                    System.out.printf("%s0%s %s\t", reihe + 1, sitz + 1, belegt ? "B" : "");
                }

            }

            System.out.println();
        }

    }

    public static int fineSitzplaetzeInReihe(boolean[][] sitzplan, int zuFindenePlaetze) {
        int gefundenerSitzplatz = 0;
        int freiePlaetze;
        boolean erfolgreichVerteilt = false;

        for (int reihe = 0; reihe < MAX_REIHEN && !erfolgreichVerteilt; reihe++) {

            freiePlaetze = 0;
            gefundenerSitzplatz = 0;

            for (int sitz = 0; sitz < MAX_SITZE_PRO_REIHE && !erfolgreichVerteilt; sitz++) {

                if (!sitzplan[reihe][sitz]) {
                    freiePlaetze++;

                    if (gefundenerSitzplatz == 0) {
                        gefundenerSitzplatz = ((reihe + 1) * 100) + (sitz + 1);
                    }

                } else {
                    gefundenerSitzplatz = 0;
                    freiePlaetze = 0;
                }

                if (freiePlaetze >= zuFindenePlaetze) {
                    erfolgreichVerteilt = setzeReiheAufBelegt(sitzplan, zuFindenePlaetze, gefundenerSitzplatz);
                }

            }


        }

        return gefundenerSitzplatz;
    }

    public static int fineSitzplaetzeInReihe(boolean[][] sitzplan, int zuFindenePlaetze, int reihe) {

        if (reihe > MAX_REIHEN - 1) {
            reihe = MAX_REIHEN - 1;
        } else if (reihe < 0) {
            reihe = 0;
        }

        int gefundenerSitzplatz = 0;
        int freiePlaetze = 0;
        boolean erfolgreichVerteilt = false;

        for (int sitz = 0; sitz < MAX_SITZE_PRO_REIHE && !erfolgreichVerteilt; sitz++) {


            if (!sitzplan[reihe][sitz]) {
                freiePlaetze++;

                if (gefundenerSitzplatz == 0) {
                    gefundenerSitzplatz = ((reihe + 1) * 100) + (sitz + 1);
                }

            } else {
                gefundenerSitzplatz = 0;
                freiePlaetze = 0;
            }

            if (freiePlaetze >= zuFindenePlaetze) {
                erfolgreichVerteilt = setzeReiheAufBelegt(sitzplan, zuFindenePlaetze, gefundenerSitzplatz);
            }

        }

        return gefundenerSitzplatz;
    }

    private static boolean setzeReiheAufBelegt(boolean[][] sitzplan, int sitzeZuVergeben, int sitzplatz) {

        int reihe = (sitzplatz / 100) - 1;
        sitzplatz = sitzplatz - ((reihe + 1) * 100) - 1;

        int vergebeneSitze = 0;

        for (int sitz = sitzplatz; sitz < MAX_SITZE_PRO_REIHE; sitz++) {

            sitzplan[reihe][sitz] = true;
            vergebeneSitze++;

            if (vergebeneSitze >= sitzeZuVergeben) {
                break;
            }

        }

        return true;
    }

}
