package com.company;
import java.util.Scanner;

public class Main {

    public static int mainMenu() {
        System.out.println("MENU");
        System.out.println("----\n");
        System.out.println("1 - Lend a Book");
        System.out.println("2 - Book Management");
        System.out.println("3 - Inventory Management");
        System.out.println("4 - Quit");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int lendMenu() {
        System.out.println("LEND A BOOK");
        System.out.println("-----------\n");
        System.out.println("Search a Book...");
        System.out.println("1 - By Title");
        System.out.println("2 - By Author");
        System.out.println("3 - By Category");
        System.out.println("4 - By ISBN");
        System.out.println("5 - Go Back");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int bookMgmtMenu() {
        System.out.println("BOOK MANAGEMENT");
        System.out.println("---------------\n");
        System.out.println("1 - Add Book");
        System.out.println("2 - Edit Book");
        System.out.println("3 - Delete Book");
        System.out.println("4 - Go Back");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int inventoryMgmtMenu() {
        System.out.println("INVENTORY MANAGEMENT");
        System.out.println("--------------------\n");
        System.out.println("1 - Edit Number of Copies");
        System.out.println("2 - Go Back");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Boolean quit = false;
        while (!quit) {
            int choice = mainMenu();

            switch (choice) {
                case 1:
                    System.out.println("lending a book");
                    // call lendMenu()
                    break;
                case 2:
                    System.out.println("book management");
                    // call bookMgmtMenu()
                    break;
                case 3:
                    System.out.println("inventory management");
                    // call inventoryMgmtMenu()
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    quit = true;
                    break;
                default:
                    // do nothing
            }
        }
    }
}
