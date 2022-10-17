package day52_practice;

public class Task21 {
    /*
    21- Write a function that can verify if a password is valid or not. requirements:
*                 1. Password MUST be at least have 6 characters and should     not contain space
*                 2. PassWord should at least contain one upper case letter
*                 3. PassWord should at least contain one lowercase letter
*                 4. Password should at least contain one special characters
*                 5. Password should at least contain a digit
*         if all requirements above are met, the method returns true, otherwise returns false

     */


    public static boolean isValid(String password) {
        boolean isValid = false;
        int upperCase = 0;
        int lowerCase = 0;
        int specialChar = 0;
        int digit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperCase++;
            } else if (Character.isLowerCase(password.charAt(i))) {
                lowerCase++;
            } else if (Character.isDigit(password.charAt(i))) {
                digit++;
            } else {
                specialChar++;
            }
        }

        if (password.length() >= 8 && !password.contains(" ") && upperCase >= 1 && lowerCase >= 1 && specialChar >= 1 && digit >= 1) {
            isValid = true;
        }
        return isValid;

    }

    public static void main(String[] args) {
        String str = "%Gt5OlaOlaOla";
        String str1 = "$$$$RRRRttt";
        String str2 ="U 435u$$44";
        String str3 = "$Gu55";

        System.out.println("str = " + isValid(str));
        System.out.println("str1 = " + isValid(str1));
        System.out.println("str2 = " + isValid(str2));
        System.out.println("str3 = " + isValid(str3));


    }
}












