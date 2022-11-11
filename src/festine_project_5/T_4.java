package festine_project_5;

public class T_4 {
    /*
    4️⃣  Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
*/

    public static int max(int[]arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max= arr[i];
            }

        }

        return max;

    }

    public static void main(String[] args) {
        int[]arr = {2,44,1,66,2,3,5};

        System.out.println("max(arr) = " + max(arr));
    }

}
