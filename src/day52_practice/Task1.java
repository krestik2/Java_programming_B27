package day52_practice;

public class Task1 {
    /*
    1. String reverse.
Write a method that will take one string as an argument and will return the reverse version of this string.

 // reverseStr("apple")  -> elppa
  // reverseStr("John")   -> nhoJ
  // reverseStr("phone")  -> enohp
  // reverseStr("123456") -> "654321"

    */

    public static String reverseStr(String one){
        String reverse = "";
        for(int i=one.length()-1;i>=0; i--){
            reverse+=one.charAt(i);}

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("reverseStr(\"capital\") = " + reverseStr("capital"));
    }
}
