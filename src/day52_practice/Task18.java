package day52_practice;

public class Task18 {

    /*
    18- Write the method to return the sum of all integers found in the parameter String
     */
//
    public static int sum(String str) {

        int sum = 0;
        String[] arr = str.split("");
        for (String eachNum : arr) {
            sum += Integer.parseInt(eachNum);
        }

        return sum;
    }


    public static void main(String[] args) {

        String num = "123456789";
        String num1 = "123";

        System.out.println(sum(num));
        System.out.println(sum(num1));

    }
}
