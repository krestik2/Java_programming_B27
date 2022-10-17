package day52_practice;

import java.util.Arrays;

public class Task12 {

    /*
    12. The Fibonacci.
  // fib(3)  -> 0 1 1
  // fib(5)  -> 0 1 1 2 3
  // fib(6)  -> 0 1 1 2 3 5
  // fib(10) -> 0 1 1 2 3 5 8 13 21 34

     */

// return array type
    public static int[] fibo(int num){
       int[]arr = new int[num];
       arr[0]=0;
       arr[1]=1;
       int count =1;
        for (int i = 2; i < num; i++) {
            arr[i]= arr[i-1]+arr[i-2];
        }

        return arr;
    }

// return int type
    public static String fib(int num) {

        int a = 0;  //index 0
        int b = 1;  //index 1
        int result = 0;
        String str = "";

       String str1 = a+ " " + b;


        for (int i = 2; i < num; i++) {
            result = a + b;
            str += " "+ result;
            a = b;            //preparing for next iteration  a = 1; a =1; a=2;
            b = result;       //                              b = 1;  b=2;  b=3;

        }

        return  str1 + str;


    }





    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibo(8))); // array

        System.out.println(fib(8));




        }}










