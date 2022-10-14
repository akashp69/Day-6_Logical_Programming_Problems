package com.bridgelabz.programsforjunit;

import java.util.Arrays;

public class SwapTwoNibbles {
    public static void main(String[] args) {

        int arr [] = {0,1,1,0,0,1,0,0};
        int temp,index;
        index=(arr.length-4);
         for(int i=0;i<4;i++) {
             temp       = arr[i];
             arr[i]     = arr[index];
             arr[index] = temp;
             index++;

         }
         int arr1[]=arr;
        System.out.println((Array.toString(arr1));


    }
}
