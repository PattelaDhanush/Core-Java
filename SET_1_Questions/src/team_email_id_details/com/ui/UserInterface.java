package team_email_id_details.com.ui;

import java.util.Scanner;

import team_email_id_details.com.utility.EmployeeBO;

public class UserInterface {

	public UserInterface() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeBO e=new EmployeeBO();
		while(true) {
			System.out.println("1. Add Employee Details\n2. Number of Official Email\n3. Exit");
			int n=sc.nextInt();sc.nextLine();
			switch(n) {
			case 1:	System.out.println("Enter the Team Name");
					String tname=sc.nextLine();
					System.out.println("Enter the official mail id");
					String email=sc.nextLine();
					e.addEmployeeDetails(tname, email);
					break;
			case 2: System.out.println("Enter the team Name to find number of official mail");
					String team=sc.nextLine();
					int k=e.countOfOfficialMailIds(team);
					System.out.println(k);
					break;
			case 3: System.exit(0);
			default: System.out.println("Invalid Option");
			}
			
		}

	}

}
