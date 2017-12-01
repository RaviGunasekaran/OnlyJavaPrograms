package com.test.java.recursive;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("\n\nFibonacii Serious Program \n\n");
        System.out.println("If n=5, then =0 1 1 2 3 5 8 \n");
        FibonacciSeries obj = new FibonacciSeries();
        obj.printFibo(5);
    }

    int n1 = 0, n2 = 1, n3 = 0;

    void printFibo(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibo(count - 1);
        }
    }
}
