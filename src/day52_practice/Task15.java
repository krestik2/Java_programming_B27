package day52_practice;

import java.util.Arrays;

public class Task15 {
    /*

15-Write the program that can move all the 0 at the end of the array

     */

    public static int[] moveZeros(int[]arr){
        int count =0;
        int[]arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr1[count++] =arr[i];
            }
        }
        return arr1;

    }

    public static void main(String[] args) {
        int[]arr={0,1,2,0,5,6,7};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }
}
