package org.example;

import consorcio.classes.Card;
import consorcio.classes.Customer;
import consorcio.classes.Group;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
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
            showMenu();
            operation = scanner.next();
            chooseMenu(operation);
        } while (!operation.equals("3"));
    }

    public static void showMenu() {

        System.out.println(" What you wanna do today ? \n 1 - Create Account \n 2 - Acquire a Card \n 3 - Close Program");
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

        String answer;

        System.out.println("Write your full name");
        name = scanner.nextLine();

        System.out.println("Write the name of your street");
        street = scanner.nextLine();

        System.out.println("Write your CPF without special characters (. * - #)");
        cpf = scanner.nextLine();

        System.out.println("Write your cellphone/telephone number without special characters (. * - #)");
        cel = scanner.nextLine();

        Customer customer = new Customer(cpf, street, name, cel);
        Customer.allCustomers.add(customer);

        System.out.println("Your account was successfully created!");

        System.out.println(
                "\n Name: " + customer.getName() +
                "\n CPF: " + customer.getCpf() +
                "\n Street: " + customer.getStreet() +
                "\n Cellphone: " + customer.getCel()
        );


    }

    public static void acquireCard() {

        Scanner scanner = new Scanner(System.in);

         String chooseOfGroup;

        Group group = new Group("Automotive", 70, new ArrayList<>());
        List<Double> creditCardValuesGroup = Group.generateCreditCardValues(10000, 25000, 120000);

        // Set the generated values to the group's cardsAvailable attribute
        group.setCardsAvailable(creditCardValuesGroup);

        Group groupTwo = new Group("Home", 200, new ArrayList<>());
        List<Double> creditCardValuesGroupTwo = Group.generateCreditCardValues(50000, 100000, 600000);

        // Set the generated values to the group's cardsAvailable attribute
        groupTwo.setCardsAvailable(creditCardValuesGroupTwo);

        Group.showAllGroups();

        System.out.println("What group fit's better with you? (1/2)");
        chooseOfGroup = scanner.nextLine();

        Double valueOfCard;
        int numberOfCard;
        Group groupAssociated;
        Customer holderOfCard = null;

        if (chooseOfGroup.equals("1")) {
            groupAssociated = group;
        } else if (chooseOfGroup.equals("2")) {
            groupAssociated = groupTwo;
        } else {
            System.out.println("Invalid Group");
            return;
        }

        System.out.println("Select a customer by CPF: ");

        for (Customer customer : Customer.allCustomers) {
            System.out.println("Name: " + customer.getName() + ", CPF: " + customer.getCpf());
        }

        String cpf = scanner.nextLine();

        for (Customer customer : Customer.allCustomers) {
            if (customer.getCpf().equals(cpf)) {
                holderOfCard = customer;
                break;
            }
        }

        if (holderOfCard == null) {
            System.out.println("Customer not found");
            return;
        }

        switch (chooseOfGroup) {
            case "1":
                groupAssociated = group;

                System.out.println("What number of card do you want? (1-500)");
                numberOfCard = scanner.nextInt();

                System.out.println("What the value of the card?");
                System.out.println(group.getCardsAvailable());

                valueOfCard = scanner.nextDouble();

                boolean isValidCard = Card.chooseCard(valueOfCard, group.getCardsAvailable());

                if (isValidCard) {
                    Card card = new Card(valueOfCard, numberOfCard, groupAssociated, holderOfCard);
                    System.out.println("Card acquired successfully!");
                    System.out.println("Customer: " + holderOfCard.getName() + "\nCard Number: " + numberOfCard + "\nCard Value: " + valueOfCard + "\nType" + group.getTypeCons());
                    Card.allCards.add(card);

                }
                else {
                    System.out.println("Please try again.");
                }
                break;

            case "2":
                groupAssociated = groupTwo;

                System.out.println("What number of card do you want? (1-200)");
                numberOfCard = scanner.nextInt();

                break;


            default:
                System.out.println("Invalid operator");

                break;

        }






    }
}
