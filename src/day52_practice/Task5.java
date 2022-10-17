package day52_practice;

public class Task5 {
    /*
    / isPalNum(545)   -> true
  // isPalNum(1001)  -> true
  // isPalNum(13)    -> false
  // isPalNum(33)    -> true

     */

    public static boolean isPalNum(int num){
        for (int i = num; i >=0; i--) {
            for (int j = 0; j <= num; i++){
                return i==j;
            }
        }
        return false;

        }

    public static void main(String[] args) {
        int num =131;
        int num2 =25;
        System.out.println("isPalNum(num) = " + isPalNum(num));
        System.out.println("isPalNum(num2) = " + isPalNum(num2));

    }

        }


