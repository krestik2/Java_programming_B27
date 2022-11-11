package festine_project_5;

public class T_3 {

    /*

            3️⃣   String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string*/

public static int sum(String str){
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
        sum+= Integer.parseInt(str.charAt(i)+"");
    }

    return sum;
}

    public static void main(String[] args) {
        String str = "123";
        String str1= "123456";
        String str2 = "5555";

        System.out.println("sum(str) = " + sum(str));
        System.out.println("sum(str1) = " + sum(str1));
        System.out.println("sum(str2) = " + sum(str2));
    }



}
