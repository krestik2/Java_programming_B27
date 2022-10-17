package day52_practice;

public class Task20 {
    /*

20- Remove all extra space from the sentence 

     */

    public static String removeAll(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "I love Java";
        System.out.println(removeAll(str));
    }
}
