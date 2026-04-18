package java_midterm_prep;
import java.util.Scanner;

public class coinChanger {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount (won): ");
        int amount = sc.nextInt();

        int[] coins = {500, 100, 50, 10};
        int totalCoins = 0;

        for (int coin : coins) {
            int count = amount / coin;
            if (count > 0) {
                System.out.println(coin + "-won: " + count);
                totalCoins += count;
                amount %= coin;
            }
        }

        System.out.println("Total: " + totalCoins + " coins");
        sc.close();
    }
}
