package festine_project4;

public class T_5 {
    /*

5️⃣  String -- Reverse
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse( String a){
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            result+= a.charAt(i);

        }
return result;
        }

    public static void main(String[] args) {
        String str= "I love Java";
        System.out.println(reverse(str));
    }
    }

