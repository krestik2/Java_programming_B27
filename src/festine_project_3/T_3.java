package festine_project_3;

import java.util.Scanner;

public class T_3 {
    /*
                3️⃣  Numbers -- Reverse negative number.
    Write a return method that can reverse a negative number and return it as int.

     */


        public static int reverseNegative(int num){
        String str = Integer.toString(num); // converting int num to a String so I could do a loop and reverse it
        String result ="-"; // storing minus "-" to a result, this way I don't have to worry about it later


        for (int i = str.length()-1 ; i >=1 ; i--) { // i>=1, because I don't need to go to i=0, I already stored minus to a result
            result += "" + str.charAt(i);
        }

       int reverse = Integer.parseInt(result); // converting String to int

       return reverse;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter any negative number");
        int num = input.nextInt();
        System.out.println("Reverse result: " + reverseNegative(num));
    }
}
