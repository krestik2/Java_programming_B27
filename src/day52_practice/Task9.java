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

 public static boolean isAnagramWithArray(String str, String str1){
        boolean equals = false;


    char[]chars = str.toCharArray();
    char[]chars1= str1.toCharArray();

    Arrays.sort(chars);
    Arrays.sort(chars1);

    if(Arrays.equals(chars,chars1)){
        equals=true;
    }


        return equals;

    }



    public static void main(String[] args) {
        String a = "lol";
        String b = "oll";
        
        System.out.println("String is built out of the same letters: " + isAnagramWithArray(a,b));

        String c = "lol";
        String d = "ole";
      
        System.out.println("String is built out of the same letters: " + isAnagramWithArray(c,d));

    }
}

