package java_midterm_prep;
import java.util.Scanner;

public class caser_ciper {
	//function to shift character
	 public static char shiftChar(char c ,int shift) {
		 if (Character.isUpperCase(c)){
			 return (char)((c-'A' + shift )%26 +'A');
		 } else if (Character.isLowerCase(c)){
			 return (char)((c-'a'+shift)%26 +'a');
		 } else {
			 return c;
		 } 
	 }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// ask string 
		System.out.println("Enter text to encode: ");
		String text = input.nextLine();
		
		//ask shift value 
		System.out.println("Enter the value to shift: ");
		int value = input.nextInt();
		
		//use string  builder in java string are immutable 
		StringBuilder encoded = new StringBuilder();
		for(char c :text.toCharArray()) {
			encoded.append(shiftChar(c,value));
		}
		System.out.println("Encoded Result: "+ encoded.toString());
		
		input.close();
	}
	}

