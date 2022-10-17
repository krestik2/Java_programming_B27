package day52_practice;

public class Task13 {

    /*

13- write the program that can find the first duplicated element Array

     */


    public static int firstDup(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                result = arr[i];
                break;
            }


        }


        return result;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 4, 7, 18, 20, 7};
        System.out.println(firstDup(arr));
    }

}
