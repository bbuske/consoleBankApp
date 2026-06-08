package org.buskeit;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n##### WELCOME TO THE BANKING APP #####");
        System.out.print("Please enter your name: ");
        String username =  scanner.nextLine();

        double balance = 1000.00;
        int choice;

        do {
            System.out.println("##### MAIN MENU #####");
            System.out.println("Welcome, " + username + "!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Salir");
            System.out.print("Please make your choice (1-4): ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Amount to deposit: ");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposit of $%.2f successful. Your new balance is $%.2f%n!", deposit, balance);
                    } else {
                        System.out.println("The amount entered is invalid. It must be positive.");
                    }
                    break;
                case 3:
                    System.out.print("Amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("The amount entered is invalid. It must be positive.");
                    } else if (withdraw <=balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrawal successful. Your new balance is: $%.2f.%n", balance);
                    } else {
                        System.out.println("Balance Insufficient! Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our banking app, " + username + "! See you soon.");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
