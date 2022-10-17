package day52_practice;

public class Task4 {
    /*
    4. String palindrome.
 // isPal("anna")   -> true
  // isPal("civic")  -> true
  // isPal("apple")  -> false
  // isPal("level")  -> true

     */

    public static boolean isPal(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for(int j= str.length()-1; j>=0; j--){
                return str.charAt(i)==str.charAt(j);
            }

        }

        return false;

    }

    public static void main(String[] args) {
        String str="annA";
        System.out.println("isPal(str) = " + isPal(str));
    }
}
