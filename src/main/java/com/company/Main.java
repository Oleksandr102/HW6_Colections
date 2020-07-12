package main.java.com.company;


import main.java.com.company.operations.Divisible;
import main.java.com.company.operations.Matching;
import main.java.com.company.operations.ReplacementOps;

public class Main {

    public static void main(String[] args) {

        Divisible a = new Divisible();
        a.addItems();
        a.printFilteredList();

        ReplacementOps b = new ReplacementOps();
        b.createItemList();
        b.listSearch();

        Matching c = new Matching();
        c.addValues();
        c.matchingElements();
    }
}
