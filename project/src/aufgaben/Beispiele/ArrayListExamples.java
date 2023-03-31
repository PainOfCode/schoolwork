package aufgaben.Beispiele;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExamples {

    private static ArrayList<Integer> testList = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));


    public static void one() {

        printList(testList);

        testList.add(4, 22);

        printList(testList);

    }

    public static void two() {

        printList(testList);

        testList.remove(4);

        printList(testList);

    }

    public static void three() {

        try {
            testList.add(20, 99);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        printList(testList);
    }

    public static void four() {

        ArrayList<Double> messwerte = new ArrayList<>(List.of(4.3, -9.0, 0.0, 11.12, 99.0));

        printList(messwerte, "Vor Verarbeitung", true);

        //0: 4.3 1: -9.0 2: 0.0 3: 0.25 4: 11.12 5: 99.0
        messwerte.add(3, 0.25);

        printList(messwerte, "Nach hinzufügen", true);

        //0: 4.3 1: 0.0 2: 0.25 3: 11.12 4: 99.0
        messwerte.remove(1);

        printList(messwerte, "Nach entfernen", true);
    }

    private static void printList(ArrayList list) {

        printList(list, "", false);

    }

    private static void printList(ArrayList list, String caption, boolean index) {

        if (!caption.isBlank()) {
            System.out.println(caption + ": ");
        }

        for (int i = 0; i < list.size(); i++) {

            if (index) {
                System.out.print(i + ": ");
            }

            System.out.print(list.get(i).toString() + " ");
        }

        System.out.println("\n------");

    }

}
