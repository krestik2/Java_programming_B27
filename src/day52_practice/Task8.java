package day52_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Task8 {
    /*
    8. Swap values of two variables (with/without extra variable)
    int j = 15;
    int i = 10;

     */

    public static String swap(int a, int b){
        ArrayList<Integer>list= new ArrayList<>();
        list.add(a);
        list.add(b);
        Collections.swap(list, 0 ,1);

        String result = "" + list.get(0) +" " + list.get(1);

        return result;
    }

    public static void main(String[] args) {
        int j = 15;
        int i = 10;

        System.out.println("swap(15,10) = " + swap(15, 10));
    }
}
