import java.util.Scanner;

public class lab01 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Method using append
            System.out.print("Enter a string: ");
            String inputString = input.nextLine();

            String reversed = "";

            for (int i = inputString.length() - 1; i >= 0; i--) {
                reversed = reversed + inputString.charAt(i);
            }

            System.out.println("Reversed (Append method): " + reversed);

            // Reset reversed for second method
            reversed = "";

            // Alternative method using prepend
            System.out.print("Enter another string: ");
            inputString = input.nextLine();

            for (int i = 0; i < inputString.length(); i++) {
                reversed = inputString.charAt(i) + reversed;
            }

            System.out.println("Reversed (Prepend method): " + reversed);

        }

}
