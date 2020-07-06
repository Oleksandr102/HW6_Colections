package main.java.com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("nuts");
        fruits.add("melon");
        fruits.add("Orange");
        if (fruits.contains("Orange")) {
            int orange = fruits.indexOf("Orange");
            fruits.set(orange, "Grapefruit");
            System.out.println(fruits);
        } else {
            System.out.println("No oranges found");
        }

        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(22);
        test1.add(33);
        test1.add(44);
        test1.add(55);
        test1.add(66);
        test1.add(21);

        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(11);
        test2.add(21);
        test2.add(32);
        test2.add(44);
        test2.add(54);
        test2.add(66);

        test1.retainAll(test2);
        System.out.println("Common elements: " + test1);
    }
}
