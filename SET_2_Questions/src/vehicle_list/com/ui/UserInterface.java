package vehicle_list.com.ui;

import java.util.Scanner;

import vehicle_list.com.utility.VehicleBO;

public class UserInterface {

	public UserInterface() {
		super();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VehicleBO v=new VehicleBO();
		int n=0;
		while(true) {
			
			System.out.println("1. Add Vehicle Details\n2. Last Vehicle Id\n3. Exit\nEnter your choice");
			n=sc.nextInt();sc.nextLine();
			switch(n) {
			case 1: System.out.println("Enter the Vehicle Type");
					String type=sc.nextLine();
					System.out.println("Enter the Vehicle Id");
					int id=sc.nextInt();
					v.addVehicledetails(type, id);
					break;
			case 2: System.out.println("Enter the Vehicle Type to search the last element");
					String cat=sc.nextLine();
					System.out.println(v.findLastvehicleId(cat));
					break;
			case 3: System.exit(0);
					break;
			default: System.out.println("Invalid Option");
			}
			
		}

	}

}
