package festine_project_5;

import java.util.ArrayList;
import java.util.Arrays;

public class T_1 {
/*   1️⃣  String -- Sort Letters and Numbers from alphanumeric String
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
    Ex:
    Input:  "DC501GCCCA098911"
    OutPut: "CD015ACCCG011899"


    My approach is to split the String, add it to ArrayList, sort each element of the ArrayList and covert it back to String.
    STEPS:
    1. I'll add the empty space to the string when 2 chars next to each other are not the same kind ( letter & digit || digit & letter)
    RESULT: "DC_501_GCCCA_098911"
    2. I'll convert String into ArrayList. String will be split by the empty space (" ")
    RESULT: ArrayList<String>list= [DC, 501, GCCCA, 098911]
    3. While iterating through each element of the Arraylist, I'll convert it to char array, sort it and add it to String result.
    4. Done!

     */

    public static String sortLettersAndNumbers(String sbr){

        String result = "";

        for (int i = 0; i < sbr.length() - 1; i++) {
            boolean same = Character.isLetter(sbr.charAt(i)) && Character.isLetter(sbr.charAt(i + 1)) ||
                    (Character.isDigit(sbr.charAt(i)) && Character.isDigit(sbr.charAt(i + 1)));
            if (same == false) {
                result += sbr.charAt(i) + " ";
            } else {
                result += sbr.charAt(i);
            }
        }

        ArrayList<String> list = new ArrayList<>(Arrays.asList(result.split(" ")));

        String result1 = "";

        for (int i = 0; i < list.size(); i++) {
            char[] arr = list.get(i).toCharArray();
            Arrays.sort(arr);
            result1 += new String(arr);
        }

        return result1;
    }



    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        String str1 = "VVG4646ELACT7681100";

        System.out.println("sortLettersAndNumbers(str) = " + str + " = " + sortLettersAndNumbers(str));
        System.out.println("sortLettersAndNumbers(str1) = " + str1 + " = " + sortLettersAndNumbers(str1));

    }


}

