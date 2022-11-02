package festine_project4;

public class T_3 {
    /*
    3️⃣  String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */

    public static String frequency(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(result.contains(str.substring(i, i+1))){
                continue;
            }
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                    count++;
            }
            result += str.charAt(i) + "" + count;

        }
        return result;
    }

    public static void main(String[] args) {
        String a = "AAABBBBBCCCCD";
        System.out.println(frequency(a));
    }

    }

