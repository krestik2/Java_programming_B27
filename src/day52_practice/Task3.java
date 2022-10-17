package day52_practice;

public class Task3 {
    /*
    3. Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.

 // revWords("apple banana kiwi") -> "kiwi banana apple"
  // revWords("I am John Doe")     -> "Doe John am I"
  // revWords("orange")            -> "orange"

     */

    public static String revWords(String str){

        String[]one = str.split(" ");
        String reverse = "";

        for(int i= one.length-1; i>=0; i--){
            reverse+=one[i]+" ";
            reverse.trim();
        }

        return reverse;
    }

    public static void main(String[] args) {

        String str ="I love Java";
        System.out.println("revWords(str) = " + revWords(str));
    }

}
