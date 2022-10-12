package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the Nth number upto which you want fibonacci series; N");
        Scanner s =new Scanner(System.in);
        int N;
        N = s.nextInt();
        int i =1;
        int a=0;
        int b=1;
        while(i<=N) {
            System.out.println(a + " ");
            int nextnum = a+ b;
            a = b;
            b = nextnum;
            i++;

        }
    }
}
