package day52_practice;

import java.util.Arrays;

public class Task14 {
    /*

14 -write the method that can concat/ merge two arrays
     */

    public static int[] concat(int[]arr1, int[]arr2){

        int[]arr =new int[arr1.length+arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[count++]=arr1[i];
        }
            for (int j = 0; j < arr2.length; j++) {
                arr[count++]=arr2[j];
            }

return arr;
        }

    public static void main(String[] args) {
        int[]a ={4,5,2,6,7};
        int[]b ={1,2,3};
        System.out.println(Arrays.toString(concat(a,b)));


    }
    }

