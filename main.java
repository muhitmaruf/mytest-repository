import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print Hello World
        System.out.println("Hello, World!");

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting
        System.out.println("Welcome, " + name + "!");

        scanner.close();
    }
}