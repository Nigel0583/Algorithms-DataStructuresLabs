package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasedPD implements PhoneDirectory {
    // phone directory and related items
    private final int MAXENTRIES = 200; // maximum number of entries in phone directory
    private PhoneDirectoryEntry[] phoneDirectory = new PhoneDirectoryEntry[MAXENTRIES];
    private int numberOfEntries = 0; // number of entries
    private int currentEntry = -1; //index of entry currently displayed

    public void loadData(String filename) {
        // TODO Auto-generated method stub
        try {
            File inputFile = new File(filename);
            Scanner in = new Scanner(inputFile);
            String name;
            String number;
            int index = 0;

            while (in.hasNext()) {
                name = in.next();
                number = in.next();
                phoneDirectory[index] = new PhoneDirectoryEntry(name, number);
                index++;
            }

            numberOfEntries = index;
            //now call Arrays.sort() to sort phoneDirectory
            in.close();

        } catch (IOException exc) {
            System.out.println("File does not exist");
        }
    }

    public void saveData(String filename) {
        // TODO Auto-generated method stub
        try (PrintWriter out = new PrintWriter("file.txt")) {
            out.println("testing");
        } catch (Exception e) {
            System.out.println("Couldn't Save :(");
        }

    }

    public void addEntry(String name, String number) {
        // TODO Auto-generated method stub
        phoneDirectory[numberOfEntries] = new PhoneDirectoryEntry(name, number);
        numberOfEntries++;
        Arrays.sort(phoneDirectory, 0, numberOfEntries);

    }

    public PhoneDirectoryEntry getFirst() {
        // TODO Auto-generated method stub
        if (numberOfEntries != 0) {
            currentEntry = 0;
            return phoneDirectory[0];
        } else
            return null;
    }

    public PhoneDirectoryEntry getNext() {
        // TODO Auto-generated method stub
        if (currentEntry != numberOfEntries - 1) {
            currentEntry++;
            return phoneDirectory[currentEntry];
        } else
            return null;

    }

    public PhoneDirectoryEntry getPrevious() {
        // TODO Auto-generated method stub
        if (currentEntry != 0) {
            currentEntry--;
            return phoneDirectory[currentEntry];
        } else
            return null;
    }

    public String search(String name) {
        // TODO Auto-generated method stub
        // return number if name is found, otherwise return null
        PhoneDirectoryEntry phoneDirectoryEntry = new PhoneDirectoryEntry(name,"");
        int result = Arrays.binarySearch(phoneDirectory, 0, numberOfEntries, phoneDirectoryEntry);

        if(result >= 0)
            return "Number for " + name + " is " + phoneDirectory[result].getNumber();
        else
            return name + "Doesn't exist";
    }
}
