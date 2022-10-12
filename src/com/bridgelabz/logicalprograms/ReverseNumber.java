package com.bridgelabz.logicalprograms;

public class ReverseNumber {
    public static void main(String[] args) {


        int a = 164, r = 0;
        while (a != 0) {
            int remainder = a % 10;
            r = r * 10 + remainder;
            a = a / 10;



        }
        System.out.println("The Reverse Number is" + r);


    }}