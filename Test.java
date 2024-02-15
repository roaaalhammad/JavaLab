import java.util.Scanner;
public class Tast {

 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the number of the desired method:");
            System.out.println("1- Odd Method");
            System.out.println("2- Even Method");
            System.out.println("3- Prime Method");
            System.out.println("4- Power Method");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Opertions.odd();
                    break;
                case 2:
                    Opertions.even();
                    break;
                case 3:
                    Opertions.prime();
                    break;
                case 4:
                    Opertions.power();
                    break;
                
                   default:
                    System.out.println("Invalid choice. Please choose a number from 1 to 4.");

            }}
    }}
