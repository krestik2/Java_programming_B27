package day52_practice;

public class Task9 {
    /*
    9. Two string anagram.
  // isAnagram("listen", "silent")     -> true
  // isAnagram("triangle", "integral") -> true
  // isAnagram("abc", "bca")           -> true
  // isAnagram("abc", "ccb")           -> false
  // isAnagram("aaa", "aaab")          -> false

     */

    public static boolean isAnagram(String one, String two){
        for (int i = 0; i < one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {
                if( one.charAt(i)==two.charAt(j)){
                    return true;
                }

            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("isAnagram(\"one\",\"eno\") = " + isAnagram("one", "eno"));
    }
}
