
import java.util.Scanner;

class MainEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a scanner object
        System.out.print("Enter the highest point (n): ");
        int n = scanner.nextInt();
        scanner.close(); // Closing the scanner

        Forest forest = new Forest(5, n); // Pass n as height for the Forest trees
        System.out.println(forest);
    }
}