package org.buskeit;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n##### BIENVENIDO AL BANCO BANESCO #####");
        System.out.print("Favor ingresar su nombre: ");
        String username =  scanner.nextLine();

        double balance = 1000.00;
        int choice;

        do {
            System.out.println("##### MENU PRINCIPAL #####");
            System.out.println("Bienvenido, " + username + "!");
            System.out.println("1. Revisar Saldo");
            System.out.println("2. Deposito");
            System.out.println("3. Retiro");
            System.out.println("4. Salir");
            System.out.print("Por favor seleccione: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Su saldo actual es: $%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposito de $%.2f exitoso. Su nuevo saldo es $%.2f%n!", deposit, balance);
                    } else {
                        System.out.println("Monto invalido. Debe ser un monto positivo.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("Monto invalido. Debe ser un monto positivo.");
                    } else if (withdraw <=balance) {
                        balance -= withdraw;
                        System.out.printf("Retiro exitoso. Su nuevo saldo es: $%.2f.%n", balance);
                    } else {
                        System.out.println("Codigo 51: Fondo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar la app de Banco Banesco, " + username + "! Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción Invalida. Por favor intente nuevamente.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
