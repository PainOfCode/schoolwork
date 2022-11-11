package aufgaben;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUebungen {

    public void aufg2(Scanner sc) {
        String[] mitarbeiter = new String[5];

        mitarbeiter[0] = "Kurt Gertius";
        mitarbeiter[1] = "Anna Wurtele";
        mitarbeiter[2] = "Hajo Obermaier";
        mitarbeiter[3] = "Jörg Advocat";
        mitarbeiter[4] = "Nicole Dulon";

        System.out.println("Bitte geben Sie die Mitarbeiternummer ein: ");
        int chosenIndex = sc.nextInt() - 1;

        if (
                chosenIndex > mitarbeiter.length - 1 || chosenIndex < 0
        ) {
            System.out.println("Index out of bounds");
            return;
        }

        System.out.println("Ausgewählter Nutzer: " + mitarbeiter[chosenIndex]);
    }

    public void aufg3() {
        BigDecimal[] tagesprofit = {
                new BigDecimal("28535.43"),
                new BigDecimal("7899.99"),
                new BigDecimal("10000.00"),
                new BigDecimal("321.34"),
                new BigDecimal("84412.17"),
                new BigDecimal("55000.00")
        };

        System.out.println("Mit For-Schleife:");
        for (int i = 0; i < tagesprofit.length; i++) {
            System.out.println(i + 1 + ": " + tagesprofit[i]);
        }

        System.out.println("\n\n\n");

        int i = 1;

        System.out.println("Mit For-Each: ");
        for (BigDecimal tagprofit : tagesprofit) {
            System.out.println(i + ": " + tagprofit);
            i++;
        }

    }

    public void aufg4() {
        Integer[] zahlenArr = new Integer[101];

        for (int i = 0; i < zahlenArr.length; i++) {
            zahlenArr[i] = i;
        }

        //Array-Klon vollständig
        Integer[] aArray = zahlenArr.clone();
        printArr(aArray);

        //Array-Klon von 20 bis 80
        Integer[] bArray = Arrays.copyOfRange(zahlenArr, 20, 81);
        printArr(bArray);

        //Reversed Array
        Integer[] cArray = new Integer[101];

        for (int i = zahlenArr.length - 1, n = 0; i >= 0; i--) {
            cArray[n] = zahlenArr[i];
            n++;
        }
        printArr(cArray);

        //Nur 5er Indexe
        Integer[] dArray = new Integer[zahlenArr.length / 5];

        for (int i = 0, n = 0; i < zahlenArr.length; i++) {

            if (i % 5 == 0 && i != 0) {
                dArray[n] = zahlenArr[i];
                n++;
            }

        }
        printArr(dArray);

    }

    private void printArr(Object[] arr) {
        System.out.println("\n========================================  \n");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

    }

    public void aufg5(Scanner sc) {

        System.out.println("Um wie viele Tageseinnahmen handelt es sich?" +
                "");
        int tageseinnahmeAnz = sc.nextInt();

        BigDecimal[] tageseinnahmeArr = new BigDecimal[tageseinnahmeAnz];

        for (int i = 0; i < tageseinnahmeArr.length; i++) {
            System.out.println("Geben sie den Wert für den " + (i + 1) + "ten Tag ein: ");
            tageseinnahmeArr[i] = sc.nextBigDecimal();
        }

        BigDecimal max = BigDecimal.ZERO;
        BigDecimal min = null;
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal tagesumsatz : tageseinnahmeArr) {

            if (min == null) {
                min = tagesumsatz;
            }

            if (min.compareTo(tagesumsatz) > 0) {
                min = tagesumsatz;
            }

            if (max.compareTo(tagesumsatz) < 0) {
                max = tagesumsatz;
            }

            sum = sum.add(tagesumsatz);

        }

        BigDecimal avrg = sum.divide(new BigDecimal(tageseinnahmeAnz), RoundingMode.HALF_UP).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Durchschnitt: " + avrg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

    }

    public void aufg6() {

        BigDecimal[] m1Test = {
                new BigDecimal("0.5"),
                new BigDecimal("335.55"),
                new BigDecimal("44.55"),
                new BigDecimal("225.55")

        };
        BigDecimal[] m1TestRes = multiplyArr(m1Test, new BigDecimal("5"));
        printArr(m1TestRes);

        String[] f1Test = {
                "hello",
                "world"
        };
        String[] f1TestRes = filterArr(f1Test, 'h');
        printArr(f1TestRes);

        BigDecimal[] m2Test1 = {
                new BigDecimal("55.55"),
                new BigDecimal("33.33")

        };
        BigDecimal[] m2Test2 = {
                new BigDecimal("1111"),
                new BigDecimal("5.54"),
                new BigDecimal("55555"),
                new BigDecimal("1234"),
        };
        BigDecimal[] m2TestRes = multiArr2(m2Test1, m2Test2);
        printArr(m2TestRes);

    }

    private BigDecimal[] multiplyArr(BigDecimal[] src, BigDecimal multi) {
        BigDecimal[] res = new BigDecimal[src.length];

        for (int i = 0; i < src.length; i++) {
            res[i] = src[i].multiply(multi);
        }

        return res;
    }

    private String[] filterArr(String[] src, char filter) {

        int count = 0;
        for (String srcStr : src) {

            if (srcStr.charAt(0) == filter) {
                count++;
            }

        }

        String[] res = new String[count];

        for (int i = 0; i < src.length; i++) {

            if (src[i].charAt(0) == filter) {
                res[i] = src[i];
            }

        }

        return res;
    }

    private BigDecimal[] multiArr2(BigDecimal[] arr1, BigDecimal[] arr2) {
        BigDecimal[] resArr;
        if (arr1.length == arr2.length) {
            resArr = new BigDecimal[arr1.length];
        } else if (arr1.length > arr2.length) {
            resArr = new BigDecimal[arr1.length];
        } else {
            resArr = new BigDecimal[arr2.length];
        }

        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            resArr[i] = arr1[i].multiply(arr2[i]).setScale(2, RoundingMode.HALF_UP);
        }

        if (arr1.length > arr2.length) {

            for (int i = arr1.length - arr2.length; i < arr1.length; i++) {
                resArr[i] = arr1[i];
            }

        } else if (arr1.length < arr2.length) {
            for (int i = arr2.length - arr1.length; i < arr2.length; i++) {
                resArr[i] = arr2[i];
            }
        }


        return resArr;
    }

    public void aufg7(Scanner sc) {

        System.out.println("Wie viele Aufträge kamen heute rein?");
        int auftraege = sc.nextInt();

        String[] kennzeichen = new String[auftraege];
        String[] namen = new String[auftraege];

        for (int i = 0; i < kennzeichen.length; i++) {

            System.out.println("Bitte das Kennzeichen eingeben für den " + (i + 1) + "ten Auftrag:");
            kennzeichen[i] = sc.next();
            System.out.println("Bitte das Kennzeichen eingeben für den " + (i + 1) + "ten Auftrag:");
            namen[i] = sc.next();

        }

        System.out.println("Nach welchen Kennzeichen suchen Sie?");
        String suche = sc.next();
        String gefunden = "";

        for (int i = 0; i < kennzeichen.length; i++) {

            if (kennzeichen[i].equals(suche)) {
                gefunden = namen[i];
                break;
            }

        }

        if (!gefunden.isBlank()) {
            System.out.println(gefunden);
        } else {
            System.out.println("Kein Ergebnis gefunden");
        }

    }

}

