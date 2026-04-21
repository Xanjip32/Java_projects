import java.util.Scanner; // Required for keyboard input [2]

public class VendingMachine {
    public static void main(String[] args) {
        // Step 1: Create Scanner object [2]
        Scanner sc = new Scanner(System.in);

        // Step 2: Use an iterative loop for the session [5, 6]
        while (true) {
            // Display the menu as per Requirement 1 [1]
            System.out.println("\n=== Vending Machine ===");
            System.out.println("1. Cola    - 1,500 won");
            System.out.println("2. Cider   - 1,200 won");
            System.out.println("3. Water   -   800 won");
            System.out.println("0. Cancel");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();

            // Step 3: Handle exit condition [1, 7]
            if (choice == 0) {
                System.out.println("Exiting session... Goodbye!");
                break; // Exit the loop immediately [8]
            }

            // Step 4: Use an enhanced switch expression to set price and name [3, 9]
            int price = 0;
            String drinkName = "";

            // The arrow syntax prevents fall-through bugs [9]
            switch (choice) {
                case 1 -> { price = 1500; drinkName = "Cola"; }
                case 2 -> { price = 1200; drinkName = "Cider"; }
                case 3 -> { price = 800;  drinkName = "Water"; }
                default -> {
                    // Requirement 2: Invalid selection handling [1]
                    System.out.println("Invalid selection. Please try again.");
                    continue; // Skip rest of loop and restart [10]
                }
            }

            // Step 5: Payment handling [11]
            System.out.print("Insert amount (won): ");
            int inserted = sc.nextInt();

            // Requirement 4: Insufficient balance check [1]
            if (inserted < price) {
                System.out.println("Insufficient balance.");
                continue; // Return to the menu [12]
            }

            // Step 6: Successful purchase and change calculation [1]
            int change = inserted - price;
            System.out.printf("Purchase successful! Enjoy your %s.%n", drinkName);
            System.out.println("Change: " + change + " won");

            // Step 7: Minimum Coin Algorithm (Chapter 3 logic) [4, 13]
            // We use integer division (/) to find counts and modulus (%) for remainders [4]
            
            // 500-won coins
            int count500 = change / 500; 
            if (count500 > 0) System.out.println("500-won coins: " + count500);
            change %= 500; // Update remaining change [14]

            // 100-won coins
            int count100 = change / 100;
            if (count100 > 0) System.out.println("100-won coins: " + count100);
            change %= 100;

            // 50-won coins
            int count50 = change / 50;
            if (count50 > 0) System.out.println("50-won coins: " + count50);
            change %= 50;

            // 10-won coins
            int count10 = change / 10;
            if (count10 > 0) System.out.println("10-won coins: " + count10);
        }
        
        sc.close(); // Close scanner to prevent memory leaks [11]
    }
}
