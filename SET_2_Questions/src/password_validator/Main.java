package password_validator;

import java.util.Scanner;

public class Main {
	public static boolean validatePassword(String password,String confirmpassWord) throws PasswordMismatchException{
		if(password.equals(confirmpassWord))
			return true;
		throw new PasswordMismatchException("Password entered does not match");
	}
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws PasswordMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer Name");
		String name=sc.nextLine();
		System.out.println("Enter the password");
		String password=sc.nextLine();
		System.out.println("Re-enter the password to confirm");
		String confirmpassword=sc.nextLine();
		if(Main.validatePassword(password, confirmpassword))
		System.out.println("Registered Sucessfully");

	}

}
