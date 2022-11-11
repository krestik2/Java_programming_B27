package festine_project_5;

public class T_5 {
    /*
    5️⃣ Array -- Find Minimum
    Write a method that can find the maximum number from an int Array
}

     */


    public static int min(int[]arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min= arr[i];
            }

        }

        return min;

    }

    public static void main(String[] args) {
        int[]arr = {2,44,1,66,2,3,5};

        System.out.println("min(arr) = " + min(arr));
    }

}

