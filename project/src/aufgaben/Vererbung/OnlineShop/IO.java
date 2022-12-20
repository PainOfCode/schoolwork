package aufgaben.Vererbung.OnlineShop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IO {

    public void aufgabe1() {

        Artikel[] artikelArray = new Artikel[10];

        artikelArray[0] = new Buch(1, "C++ for dummies", new BigDecimal("13.33"), "1234-4568-9533", "KLEE", 600);
        artikelArray[1] = new Buch(2, "Java for dummies", new BigDecimal("14"), "4568-1234-9533", "KLEE", 450);
        artikelArray[2] = new Buch(3, "C for dummies", new BigDecimal("16.66"), "9533-1234-4568", "KLEE", 800);
        artikelArray[3] = new CD(4, "Ungrateful", new BigDecimal("3.99"), "Label", "Rock", new BigDecimal("121"));
        artikelArray[4] = new CD(5, "Song", new BigDecimal("6.66"), "Label", "genre", new BigDecimal("222"));
        artikelArray[5] = new CD(6, "Hello", new BigDecimal("233"), "Label", "World", new BigDecimal("333"));
        artikelArray[6] = new CD(7, "World", new BigDecimal("22"), "Label", "Hello", new BigDecimal("4000"));
        artikelArray[7] = new Kleidung(8, "T-Shirt", new BigDecimal("16.99"), "Baumwolle", new BigDecimal("3"), "L");
        artikelArray[8] = new Kleidung(9, "Hoodie", new BigDecimal("15.99"), "Baumwolle", new BigDecimal("4"), "L");
        artikelArray[9] = new Kleidung(10, "Hemd", new BigDecimal("13.99"), "Baumwolle", new BigDecimal("3"), "L");

        System.out.println("\n\n");

        printArtikelArr(artikelArray);

        System.out.println("\n\n");

        printArtikelArr(aufgabe1d(artikelArray));

    }

    private CD[] aufgabe1d(Artikel[] artikelArray) {

        int counter = 0;
        for (Artikel art : artikelArray) {

            if (art == null) {
                continue;
            }

            if (art instanceof CD) {

                BigDecimal spieldauerInMinuten = ((CD) art).getSpieldauerInSekunden().divide(new BigDecimal("60"), RoundingMode.FLOOR);

                if (spieldauerInMinuten.compareTo(new BigDecimal("60")) > -1) {
                    counter++;
                }

            }

        }

        CD[] retArr = new CD[counter];
        counter = 0;

        for (Artikel art : artikelArray) {

            if (art == null) {
                continue;
            }

            if (art instanceof CD) {

                BigDecimal spieldauerInMinuten = ((CD) art).getSpieldauerInSekunden().divide(new BigDecimal("60"), RoundingMode.FLOOR);

                if (spieldauerInMinuten.compareTo(new BigDecimal("60")) > -1) {
                    retArr[counter] = ((CD) art);
                    counter++;
                }

            }

        }

        return retArr;
    }

    private void printArtikelArr(Artikel[] artikelArray) {

        for (Artikel art : artikelArray) {

            if (art == null) {
                continue;
            }

            StringBuilder output = new StringBuilder();

            if (art instanceof CD) {
                output.append("CD: ");
            } else if (art instanceof Buch) {
                output.append("Buch: ");
            } else if (art instanceof Kleidung) {
                output.append("Kleidung: ");
            }

            output.append(art);

            System.out.println(output);
        }

    }

}
