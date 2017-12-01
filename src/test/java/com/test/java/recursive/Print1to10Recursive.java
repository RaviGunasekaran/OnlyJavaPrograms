package com.test.java.recursive;

public class Print1to10Recursive {
    public static void main(String[] args) {

        System.out.println("Recursive - Numbers - Program");
        Print1to10Recursive obj = new Print1to10Recursive();
        obj.printMe();
    }

    int i = 0;

    // This program to print I value using Recursive Method.
    void printMe() {
        i++;
        if (i <= 10) {
            System.out.println("I = " + i);
            printMe();
        }
    }
}
