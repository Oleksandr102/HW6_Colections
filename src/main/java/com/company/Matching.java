package main.java.com.company;

import java.util.ArrayList;

public class Matching {
    public Matching(){
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
