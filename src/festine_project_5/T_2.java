package festine_project_5;

public class T_2 {
    /*
       2️⃣  String -- Password Validation Task
    Write a return method that can verify if a password is valid or not.
    requirements:

 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false*/


    public static boolean validPassword(String str) {

        if (str.length() < 6 || str.contains(" "))
            return false;

        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;


        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                countDigit++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                countUpper++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLower++;
            } else {
                countSpecial++;
            }


        }
        if (countDigit >= 1 && countUpper >= 1 && countLower >= 1 && countSpecial >= 1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        String password = "Abcdff23!";
        String password1 = "Zsda";
        String password2 = "ZZZaaa2222";

        System.out.println("validPassword(password) = " + validPassword(password));
        System.out.println("validPassword(password1) = " + validPassword(password1));
        System.out.println("validPassword(password2) = " + validPassword(password2));
    }
}
