package email_validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static boolean validateEmail(String customerEmailId,String confirmMail) {
			Pattern p=Pattern.compile(customerEmailId.toLowerCase());
			Matcher m=p.matcher(confirmMail.toLowerCase());
			
				return m.matches();
	}
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws MisMatchException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer Name");
		String custName=sc.nextLine();
		System.out.println("Enter the customer Email Id");
		String email=sc.nextLine();
		System.out.println("Re-enter the customer Email Id to confirm");
		String  conEmail=sc.nextLine();
		
		if(Main.validateEmail(email,conEmail)) {
			System.out.println("Registered Sucessfully");
		}
		else {
			throw new MisMatchException("Customer Email Id does not match");
		}
		
	}

}
