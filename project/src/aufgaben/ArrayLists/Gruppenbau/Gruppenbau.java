package aufgaben.ArrayLists.Gruppenbau;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Gruppenbau {


    private ArrayList<String> readNamesFromFile() {

        ArrayList<String> nameList = new ArrayList<>();

        File namefile = new File("C:\\Users\\Laptop\\IdeaProjects\\SDAufgaben\\project\\src\\aufgaben\\ArrayLists\\Gruppenbau\\namelist.txt");
        try {
            Scanner sc = new Scanner(namefile);
            sc = sc.useDelimiter("\n");

            while (sc.hasNextLine()) {
                nameList.add(sc.nextLine());
                //System.out.println(nameList.get(nameList.size() - 1));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return nameList;
    }

    public void aufgabe() {
        ArrayList<String> nameList = readNamesFromFile();

        if (nameList.size() % 4 != 0) {
            System.out.println("Ungerade anzahl an Personen");
        }

        ArrayList<ArrayList<String>> gruppenListe = new ArrayList<>();
        ArrayList<String> localList = new ArrayList<>();
        for (int i = 0; i < nameList.size(); i++) {
            if (i % 4 == 0) {
                localList = new ArrayList<>();
                gruppenListe.add(localList);
            }

            localList.add(nameList.get(i));

        }

        print2DList(gruppenListe);

        exportGrouplistAsCSV(gruppenListe);
    }

    private void print2DList(ArrayList<ArrayList<String>> gruppenListe) {

        for (int i = 0; i < gruppenListe.size(); i++) {
            System.out.print("Gruppe " + (i + 1) + ":\n");

            ArrayList<String> gruppe = gruppenListe.get(i);
            for (String name : gruppe) {
                System.out.print(name + " ");
            }

            System.out.println("\n------");
        }

    }

    private void exportGrouplistAsCSV(ArrayList<ArrayList<String>> gruppenListe) {


    }

}
