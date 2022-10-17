package day52_practice;

public class Task19 {

    /*

19- Reverse the second word in the sentence

     */

    public static void main(String[] args) {

        String str = "I love java";
        int start = str.indexOf(' ') + 1; // give me the first character of the middle word
        int end = str.lastIndexOf(' ');
        String middleWord = str.substring(start, end);

        String reverseMiddle = "";
        for(int i = middleWord.length() - 1; i >= 0; i--){ // loop starts from the last index of the middle word and goes until the first index in a backward order
            reverseMiddle += middleWord.charAt(i); // reading each character based on the int i value, which is going backwards and then concatenating that character to the reverseMiddle String
        }

        System.out.println(str.substring(0, str.indexOf(' ')) + " " + reverseMiddle + " " + str.substring(end + 1));

        //str.substring(0, str.indexOf(' ') gives the first word
        // str.substring(0, str.indexOf(' ') could have been written as: str.substring(0, start - 1)

        // str.substring(end + 1) could have been written as: str.substring(str.lastIndexOf(' ') + 1)


        //str.replace(middleWord, reverseWord) another option instead of line 26

    }
}

/*

take a look at, alternative to reverse middle

      String str = "I love java";
      String reverse = "";

      for(int i = str.lastIndexOf(' ') - 1; i > str.indexOf(' '); i--){
        reverse += str.charAt(i); // reverse = reverse + str.charAt(i)
      }

 */

