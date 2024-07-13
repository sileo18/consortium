package org.example;

import consorcio.classes.Customer;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String operation;

        System.out.println("Hey, whats your name?");
        name = scanner.next();

        do {
            showMenu(name);
            operation = scanner.next();
            chooseMenu(operation);
        } while (!operation.equals("3"));
    }

    public static void showMenu(String name) {

        System.out.println(name + " What you wanna do today ? \n 1 - Create Account \n 2 - Acquire a Card \n 3 - Close Program");
    }
    public static void chooseMenu(String operation) {

        switch (operation) {
            case "1":
                createAccount();

                break;

            case "2":
                acquireCard();

                break;

            case "3":
                System.out.println("Ok, see u next time!");

                break;

            default:
                System.out.println("Invalid operator");

                break;

        }
    }

    public static void createAccount() {

        Scanner scanner = new Scanner(System.in);

        String cpf;
        String street;
        String name;
        String cel;

        String nothing;

        System.out.println("Write your full name");
        name = scanner.nextLine();

        System.out.println("Write the name of your street");
        street = scanner.nextLine();

        System.out.println("Write your CPF without special characters (. * - #)");
        cpf = scanner.nextLine();

        System.out.println("Write your cellphone/telephone number without special characters (. * - #)");
        cel = scanner.nextLine();

        Customer customer = new Customer(cpf, street, name, cel);

        System.out.println("Your account was successfully created!");

        System.out.println(
                "\n Name: " + customer.getName() +
                "\n CPF: " + customer.getCpf() +
                "\n Street: " + customer.getStreet() +
                "\n Cellphone: " + customer.getCel()
        );

        nothing = scanner.next();

    }

    public static void acquireCard() {

    }
}
