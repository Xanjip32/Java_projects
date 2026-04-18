package java_midterm_prep;
import java.util.Scanner;

public class Vending_machine_simulator {
    // Prices: index 1=Cola, 2=Cider, 3=Water, 0=Cancel
    static int[] prices = {0, 1500, 1200, 800};

    // Show menu
    public static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cola (1500 won)");
        System.out.println("2. Cider (1200 won)");
        System.out.println("3. Water (800 won)");
        System.out.println("0. Cancel");
    }

    // Ask user and get valid selection
    public static int getSelection(Scanner sc) {
        int choice = -1;
        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= 0 && choice <= 3) {
                    return choice; // valid
                } else {
                    System.out.println("Invalid selection. Please try again!\n");
                }
            } else {
                System.out.println("Invalid selection. Please try again!\n");
                sc.next(); // clear invalid input
            }
        }
    }

    // Handle payment
    public static boolean processPayment(Scanner sc, int choice) {
        int price = prices[choice];
        System.out.print("Insert amount (won): ");
        int amount = sc.nextInt();

        if (amount < price) {
            System.out.println("Insufficient balance.\n");
            return false;
        } else {
            int change = amount - price;
            System.out.println("Purchase successful! Your change is " + change + " won.");
            giveChange(change);
            return true;
        }
    }

    // Break change into coins
    public static void giveChange(int change) {
        int[] coins = {500, 100, 50, 10};
        for (int coin : coins) {
            int count = change / coin;
            if (count > 0) {
                System.out.println(coin + " won: " + count);
                change %= coin;
            }
        }
    }

    // Main loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int choice = getSelection(sc);
            if (choice == 0) {
                System.out.println("Transaction cancelled. Goodbye!");
                break;
            }
            boolean success = processPayment(sc, choice);
            // If insufficient, loop back to menu automatically
        }

        sc.close();
    }
}
