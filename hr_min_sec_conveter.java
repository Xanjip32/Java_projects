package java_midterm_prep;
import java.util.Scanner;

public class hr_min_sec_conveter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total seconds: ");
		int totalSeconds = sc.nextInt();
		
		int hours = totalSeconds / 3600;              // 1 hour = 3600 seconds
		int minutes = (totalSeconds % 3600) / 60;     // leftover seconds → minutes
		int seconds = totalSeconds % 60;              // leftover seconds
		
		System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
		
		sc.close();
	}
}
