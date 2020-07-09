package main.java.com.company.operations;

import java.util.ArrayList;
import java.util.List;

public class Divisible {
    List<Integer> intList = new ArrayList<>();

    public Divisible() {
        addItems();
        printFilteredList();
    }

    public void addItems() {
        intList.add(3);
        intList.add(9);
        intList.add(11);
        intList.add(18);
        intList.add(20);
        intList.add(22);
    }

    public void printFilteredList() {
        intList.removeIf(i -> i % 3 == 0);
        System.out.print("Doesn't divide by 3: ");
        intList.forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }
}
