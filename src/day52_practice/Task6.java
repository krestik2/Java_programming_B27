package day52_practice;

public class Task6 {
    /*
    6. Max/min number from an array. Write a method that will accept an array of int as an argument and it will return the max/min number from a given array.

  // max({4, 781, 8, 99, 103})   -> 781
  // max({1, 2, 3, 4, 5})        -> 5
  // max({3, 4})                 -> 4
  // max({100})                  -> 100
--------------------
  // min({4, 781, 8, 99, 103})  -> 4
  // min({1, 2, 3, 4, 5})       -> 1
  // min({3, 4})                -> 3
  // min({100})                 -> 100

     */
    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        return max;
    }

    public static void main(String[] args) {
        int[]arr = {1,22,11,55,2};
        System.out.println("max(arr) = " + max(arr));
    }

}

