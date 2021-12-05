package com.company.class25.collectionframework;

import java.util.ArrayList;

public class HomeWorkArrayList {
    public static void main(String[] args) {

        /*Create an ArrayList that will store 5 names into it.
       Find out whether the given ArrayList is empty or not?
       Check whether the specific name is present in an ArrayList or not?
       Find the size of your arrayList and print all values from that
         */

        ArrayList<String>names=new ArrayList<>();

        names.add("Sebastian");
        names.add("Olga");
        names.add("Marina");
        names.add("Mustafa");
        names.add("Eleni");
        names.add("Irina");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mustafa"));
        System.out.println(names.size());

        System.out.println(names);
    }
}
