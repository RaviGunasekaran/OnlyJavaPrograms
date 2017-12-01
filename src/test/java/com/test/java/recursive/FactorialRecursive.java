package com.test.java.recursive;

public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println(" \n\n\n   ===    This Factorial Program using Recursive Method   ===  \n\n\n");
        System.out.println(" Factorial of 5 = " + findFactorial(5));
        System.out.println(" Factorial of 1 = " + findFactorial(1));
        System.out.println(" Factorial of 4 = " + findFactorial(4));
    }

    static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}
