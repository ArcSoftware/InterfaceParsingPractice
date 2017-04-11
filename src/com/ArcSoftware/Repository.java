package com.ArcSoftware;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jake on 4/11/17.
 */
public class Repository {
    private ArrayList<Person> people = new ArrayList<>();

    public Repository() throws Exception {
        initialize();
    }

    private void initialize() throws Exception {
        File f = new File("PeopleFile.csv");
        Scanner fileScanner = new Scanner(f);

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            int columnLine = 0;
           // fileScanner.nextLine();
            String[] columns = line.split(",");
            people.add(new Person(columns[columnLine++], columns[columnLine++], columns[columnLine++], columns[columnLine++], columns[columnLine++], columns[columnLine]));
        }
    }

    public void print() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}

