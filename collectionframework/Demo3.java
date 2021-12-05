package com.company.class25.collectionframework;

import java.util.PrimitiveIterator;

public class Demo3 {

int primitiveNumber=10;
Integer classNumber= primitiveNumber;
//primitiveNumber=classNumber;

Integer number=new Integer(10); // Boxing putting primitive inside a wrapper (long way not recomended)

Integer number2=10; // auto inboxing putting primitive inside a wrapper  but using shortcut.
int another=number.intValue(); // unboxing longer way
int another2=number2; // auto unboxing short way
}
