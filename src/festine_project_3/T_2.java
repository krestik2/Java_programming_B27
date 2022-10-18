package festine_project_3;

public class T_2 {

        /*    2️⃣  Numbers -- Armstrong numbers
    Write a method that can check if a number is an Armstrong number.

 If I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
                Armstrong numbers are     === 153 370 371 407 === for 3 digits  1634 8208, and 9474

    1*1*1=1
    5*5*5=125
    3*3*3=27
    125+27+1=153

     */


    public static boolean isArmstrong(int num) {
        // logic is to split num into separate digits  567 -- 5 6 7 so I could work with each number
        int sum = 0;
        String str = Integer.toString(num);// converting int into String


        //looping through the String and converting each char into int
        // Math.pow function multiplies each int by the number.length(): a*a*a ( 3 times because str.length=3) and adds to the sum
        // iterates through each number and ads to the sum

        for (int i = 0; i < str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += Math.pow(a, str.length());
        }

        return sum == num;

    }

    public static void main(String[] args) {

        int a = 222;
        int b = 370; // Armstrong number
        int c = 371; // Armstrong number
        int d = 1634; //Armstrong number
        int e = 250;

        System.out.println("a = " + isArmstrong(a));
        System.out.println("b = " + isArmstrong(b));
        System.out.println("c = " + isArmstrong(c));
        System.out.println("d = " + isArmstrong(d));
        System.out.println("e = " + isArmstrong(e));

    }
}
