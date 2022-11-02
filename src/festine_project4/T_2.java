package festine_project4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class T_2 {
    /*
    2️⃣  String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

  */

    public static String removeDupWithLoop(String word) {
        String result = "";
        String each = "";
        // each is created to not add duplicated i to the result
        // substring is created to use contains method

        for (int i = 0; i < word.length(); i++) {
            each = word.substring(i, i + 1);
            if (!result.contains(each)) {
                result += each;
            }
        }
        return result;
    }

    public static String removeDupWithSet(String word) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(word.split("")));
        Set<String> set = new LinkedHashSet<>(list);
        String result = String.join("", set);

        return result;
}


    public static String removeDupWithStream( String word){
        ArrayList<String>list = new ArrayList<>(Arrays.asList(word.split("")));
      String result =  list.stream().distinct().collect(Collectors.joining(""));


        return result;


    }



    public static void main(String[] args) {

        System.out.println("removeDupWithLoop(\"hello\") = " + removeDupWithLoop("hello"));

        System.out.println("removeDupWithSet(\"hello\") = " + removeDupWithSet("hello"));

        System.out.println("removeDupWithStream(\"hello\") = " + removeDupWithStream("hello"));


    }
}
