package day52_practice;

import java.util.Arrays;

public class Task2 {
    /*
    2. Array reverse. Write a method that will take an array as an argument and reverse it.

// revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
  // revArr({1})             -> {1}
  // revArr({1, 2, 3})       -> {3, 2, 1}

     */

    public static int[] revArr(int[]arr){
        int[]revArr = new int[arr.length];
        int count=0;

        for (int i=arr.length-1; i >=0; i--) {
            revArr[count++] = arr[i];
        }
        return revArr;
    }

    public static void main(String[] args) {
        int[]one={1,2,3,4,5};
        System.out.println(Arrays.toString(revArr(one)));
    }
}
