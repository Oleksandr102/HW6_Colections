package main.java.com.company.operations;

import java.util.ArrayList;

public class ReplacementOps {
    ArrayList<String> fruits = new ArrayList<>();

    public ReplacementOps() {
        createItemList();

        System.out.println(fruits);
        listSearch();
    }

    public void createItemList() {
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("nuts");
        fruits.add("melon");
        fruits.add("Orange");
    }

    public void listSearch() {
        if (fruits.contains("Orange")) {
            int orange = fruits.indexOf("Orange");
            fruits.set(orange, "Grapefruit");
            System.out.println(fruits);
        } else {
            System.out.println("No oranges found");
        }
    }
}
