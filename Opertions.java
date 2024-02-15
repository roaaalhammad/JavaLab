package tast;
import java.util.Scanner;
public class Opertions {
    
    public static void odd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 2 != 0) {
            System.out.println(num + " is an odd number.");
        } else {
            System.out.println(num + " is not an odd number.");
        }
    }
    
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
    }
    
    public static void prime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    
    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        System.out.println("Enter the power:");
        int power = scanner.nextInt();
        long result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println("The result is: " + result);
    }
}
