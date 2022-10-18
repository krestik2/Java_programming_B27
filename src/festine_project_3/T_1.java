package festine_project_3;

public class T_1 {

//1️⃣  Numbers -- Prime Number
//    Write a method that can check if a number is prime or not.


public static boolean isPrime(int num){
    boolean result = true;
    for (int i = 2; i < num; i++) { // any number is divisible by 1 and itself, so I don't have to use i=0 and i=num
        if(num % i == 0){
            result = false;
        }

    }
return result;
}

    public static void main(String[] args) {

        System.out.println(isPrime(14));

        System.out.println(isPrime(19));
    }

}
