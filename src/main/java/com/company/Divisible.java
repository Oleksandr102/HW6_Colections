package main.java.com.company;

import java.util.ArrayList;
import java.util.List;

public class Divisible {
    public Divisible() {
        List<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(9);
        intList.add(11);
        intList.add(18);
        intList.add(20);
        intList.add(22);

        intList.removeIf(i -> i % 3 == 0);
        System.out.print("Doesn't divide by 3: ");
        intList.forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }
}
