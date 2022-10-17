package day52_practice;

public class Task10 {
    /*
    10. Remove duplicates from a string.
  // removeDup("hello")  -> "helo"
  // removeDup("apple")  -> "aple"
  // removeDup("aaaaaa") -> "a"
  // removeDup("abc")    -> "abc"

     */



    public static String removeDup( String word){

        String result ="";
        String each = "";
        // each is created to not add duplicated i to the result
        // substring is created to use contains method

        for (int i = 0; i < word.length(); i++) {
            each = word.substring(i, i+1);
            if(!result.contains(each)){
                result+=each;
            }
        }

        return result;




    }

    public static void main(String[] args) {
        System.out.println("removeDup(\"hello\") = " + removeDup("hello"));
    }
}
