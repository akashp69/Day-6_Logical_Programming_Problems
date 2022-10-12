package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    static void checkPrime(){
        int count = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        if (n < 2)
            System.out.println ("The given is number " + n + " is not prime");


        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count += 1;
        }


        if (count > 2)
            System.out.println ("The given is number " + n + " is not prime");

        else
            System.out.println ("The given is number " + n + " is prime");
    }
    public static void main(String[] args) {

        System.out.println("Enter Number For Prime Number Checking");
        checkPrime();


    }
}
