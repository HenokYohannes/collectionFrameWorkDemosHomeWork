package com.company.class25.collectionframework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

/*
Limitation of arrays
1) Array are fixed in size

 */
        String name = "Muzit";
        String name2 = "Sky";

        String[] names = {"Muzit", "Sky"};

//names[2]="Moses"; // can not add more than 2 elements
//
        ArrayList<String> listOfNames=new ArrayList<>();
        System.out.println(listOfNames.size());

        listOfNames.add("Sami");
listOfNames.add("Kesu");
    listOfNames.add("Tamana");
        System.out.println("Size of listOfNames "+listOfNames.size());
   listOfNames.remove("Tamana");
        System.out.println("Size of listOfNames "+listOfNames.size());
    }
}