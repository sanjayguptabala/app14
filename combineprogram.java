import java.util.Scanner;

public class combineprogram {

    static int getInteger(int n) {
        return n;   
    }

    static int oddEvenNumber(int n) {
        return n % 2;
    }

    static boolean oddEvenBoolean(int n) {
        return n % 2 != 0;
    }

    static String reverseNumber(int num) {
        String numberString = String.valueOf(num);
        StringBuilder reversed = new StringBuilder(numberString);
        return reversed.reverse().toString();
    }

    static String concatenateStrings(String a, String b) {
        return a + b;
    }

    static String concat(String str1 , String str2) {
         return str1 + "" + str2;   
    }

    static int[] getArray(int[] arr) {
        return arr;
    }

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }
        return rev;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println(getInteger(num));
            System.out.println(oddEvenNumber(num));
            System.out.println(oddEvenBoolean(num));
            System.out.println(reverseNumber(num));
            System.out.println(concat("Hello" , "world"));
            System.out.println(concatenateStrings("Hello", "Java"));
            

            int[] arr = {1, 2, 3, 4, 5};
            int[] returnedArr = getArray(arr);
            for (int i = 0; i < returnedArr.length; i++) {
                System.out.print(returnedArr[i] + " ");
            }
            System.out.println();

            int[] reversedArr = reverseArray(arr);
            for (int i = 0; i < reversedArr.length; i++) {
                System.out.print(reversedArr[i] + " ");
            }

        }
    }
}