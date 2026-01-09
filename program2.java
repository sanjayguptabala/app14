
import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();

        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        reader.close();
    }
}
