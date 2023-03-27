package auswahl;

import aufgaben.interfaces.stack.IO;
import aufgaben.recursion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static final int ITERATIONS = 1000;

    public static void main(String[] args) throws InterruptedException {

        IO io = new IO();


        sc.useDelimiter("\n");

        io.aufgabe1();

        sc.close();
    }

    private static void benchmarkSort() {


        Random random = new Random(123);
        int[] randomArr = new int[10000];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(0, 65536);
        }


        //int[] randomArr = {4, 6, 2, 1, 9, 10};

        long sumSort = 0L;

        for (int i = 0; i < ITERATIONS; i++) {

            int[] testArr = Arrays.copyOf(randomArr, randomArr.length);

            long preSort = System.nanoTime();

            Arrays.sort(testArr);

            long postSort = System.nanoTime();

            sumSort += (postSort - preSort);

        }

        sumSort /= ITERATIONS;

        System.out.println("Sort A: " + sumSort);

        long sumSortSelf = 0L;

        for (int i = 0; i < ITERATIONS; i++) {

            int[] testArr = Arrays.copyOf(randomArr, randomArr.length);

            long preSort = System.nanoTime();

            sort(testArr);

            long postSort = System.nanoTime();

            sumSortSelf += (postSort - preSort);

        }

        sumSortSelf /= ITERATIONS;

        System.out.println("Sort S: " + sumSortSelf);

        long sumSortQ = 0L;

        for (int i = 0; i < ITERATIONS; i++) {

            int[] testArr = Arrays.copyOf(randomArr, randomArr.length);

            long preSort = System.nanoTime();

            quicksort(testArr, 0, testArr.length - 1);

            long postSort = System.nanoTime();

            sumSortQ += (postSort - preSort);

        }

        sumSortQ /= ITERATIONS;

        System.out.println("Sum Q: " + sumSortQ);

    }

    private static void quicksort(int[] array, int begin, int end) {


    }


    private static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int lowest = 0;
            int lowestIndex = 0;

            for (int j = i; j < array.length; j++) {

                if (j == i) {
                    lowest = array[j];
                    lowestIndex = j;
                } else {

                    if (lowest > array[j]) {
                        lowest = array[j];
                        lowestIndex = j;
                    }

                }

            }

            array[lowestIndex] = array[i];
            array[i] = lowest;

        }

    }

    private static void benchmarkRec() {
        String testString = "Hello, world, how are, dbhdflkxdf,giuffishkbfs,as dfbksjdf sd,f sdfbhjsdfh ,m f";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(testString);

        for (int i = 0; i < ITERATIONS; i++) {
            recursion.recursiveComma(testString, 0);
            recursion.countCommasRecStrBldr(stringBuilder, 0);
            recursion.commaCount(testString);
        }


        long sumOfDiffsRec = 0L;

        for (int i = 0; i < ITERATIONS; i++) {
            long nanoTime = System.nanoTime();

            int countRecursive = recursion.recursiveComma(testString, 0);

            sumOfDiffsRec += System.nanoTime() - nanoTime;
        }

        sumOfDiffsRec /= ITERATIONS;

        long sumOfDiffsRecStr = 0L;

        for (int i = 0; i < ITERATIONS; i++) {
            long nanoTimeStrb = System.nanoTime();

            int countStrb = recursion.countCommasRecStrBldr(stringBuilder, 0);

            sumOfDiffsRecStr += System.nanoTime() - nanoTimeStrb;
        }

        sumOfDiffsRecStr /= ITERATIONS;

        long sumOfDiffsNormal = 0L;

        for (int i = 0; i < ITERATIONS; i++) {
            long nanoTimeNormal = System.nanoTime();

            int countNormal = recursion.commaCount(testString);

            sumOfDiffsNormal += System.nanoTime() - nanoTimeNormal;
        }

        sumOfDiffsNormal /= ITERATIONS;

        System.out.println("Recursion String \t" + sumOfDiffsRec);

        System.out.println("For-Loop \t\t\t" + sumOfDiffsNormal);

        System.out.println("StringBldr \t\t\t" + sumOfDiffsRecStr);

    }

}