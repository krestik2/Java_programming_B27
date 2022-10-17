package day52_practice;

public class Task17 {
    /*
    17- Write the method to find the unique character from string
     */

    public static String unique(String str){
        String unique ="";

        for (int i = 0; i <str.length() ; i++) {
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && str.charAt(i)!=' '){
                unique+=str.charAt(i);
            }

        }
        return unique;
    }

    public static void main(String[] args) {

        String str ="$OneMoreTime";
        String str1 = "What a beautiful day!!!";
        System.out.println(unique(str));
        System.out.println(unique(str1));
    }
}
