package java_midterm_prep;

public class practise {
	//function
	public static void main (String[] args) {
		practise obj = new practise();
		obj.weatherIntterpreter(8);
		System.out.println(obj.admission(125));
		
		
	}
	public void weatherIntterpreter(int temperature ) {
		if (temperature > 30 ) {
			System.out.println("its hot outside! ");
		}else if ( temperature < 5 ) {
			System.out.println("its cold outside ! ");
		}else {   
			System.out.println(" medium neither hot neither cold! ");
		}
 	}
	
	public String admission(double height) {
		String passText;
		if (height >120 ) {
			passText = " you passed ";
		}else {
			passText = " sorry budddy , you don't pass";
		}
		return passText;
	}

}
