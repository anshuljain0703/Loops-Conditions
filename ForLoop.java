package loops;
import java.util.Scanner;

public class ForLoop {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);  // Initialize Scanner to read input
        System.out.println("Enter a number:"); // Prompt for input
        int n = sc.nextInt();  // Read user input

        // For loop to print numbers from 0 to n
        for(int i = 0; i <= n; i++) {
            System.out.println(i);  // Print each number
        }

        sc.close();  // Close the scanner resource to prevent resource leak
    }
}
