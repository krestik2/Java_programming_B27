package day52_practice;

import java.util.Arrays;

public class Task16 {
    /*

16- Write the function which can reverse the array number

     */

    public static int[] reverse(int[]arr){
        int[]reverse = new int[arr.length];
        int count = 0;

        for (int i = arr.length-1; i >=0 ; i--) {
            reverse[count++]=arr[i];
        }

        return reverse;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
