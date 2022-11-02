package festine_project4;

import java.util.Arrays;

public class T_1 {
    /*
1️⃣  String -- Same letters
Write a return method that checks if a string is built out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
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
