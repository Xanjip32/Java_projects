package java_midterm_prep;
import java.util.Scanner;
public class Bit_binary_string_converter {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = sc.nextInt();

	        for (int i = 7; i >= 0; i--) {
	            int bit = (n >> i) & 1;
	            System.out.print(bit);
	        }
	        System.out.println();

	        sc.close();
	    }
}
