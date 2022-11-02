package festine_project4;

public class T_4 {
 /*   4️⃣  String -- Find the unique
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";  */

    public static String unique(String str) {


        String one = "";

          for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count < 2) {
                one += str.charAt(i);
            }
        }

        return one;


    }

    public static void main(String[] args) {
        String b = "AAAAFFFGERIIII";
        System.out.println(unique(b));
    }

}
