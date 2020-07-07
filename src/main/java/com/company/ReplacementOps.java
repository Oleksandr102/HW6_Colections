package main.java.com.company;

import java.util.ArrayList;

public class ReplacementOps {
    public ReplacementOps() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("nuts");
        fruits.add("melon");
        fruits.add("Orange");

        System.out.println(fruits);

        if (fruits.contains("Orange")) {
            int orange = fruits.indexOf("Orange");
            fruits.set(orange, "Grapefruit");
            System.out.println(fruits);
        } else {
            System.out.println("No oranges found");
        }
    }
}
