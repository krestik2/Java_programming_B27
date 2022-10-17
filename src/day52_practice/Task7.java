package day52_practice;

public class Task7 {
    /*
    7. Find the second min/max number from an array.. (sort/nested loop)

  // secMax({4, 781, 8, 99, 103})  -> 103
  // secMax({1, 2, 3, 4, 5})       -> 4
  // secMax({3, 4})                -> 3

     */

    public static int secMax(int[]arr){

        int max = arr[0];
        int secMax= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>secMax && (arr[j]< max))
                    secMax = arr[j];
            }
    }

        return secMax;


}

    public static void main(String[] args) {
        int[]arr ={ 5,6,3,22,1,66};
        System.out.println("secMax(arr) = " + secMax(arr));
    }}
