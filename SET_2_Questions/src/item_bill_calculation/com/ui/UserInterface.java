package item_bill_calculation.com.ui;

import java.util.Scanner;

import item_bill_calculation.com.bean.Item;
import item_bill_calculation.com.utility.Shop;

public class UserInterface {

	public UserInterface() {
		super();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		int n=sc.nextInt();
		Shop s=new Shop();
		int id,quantity;
		String name;
		double cost;
		Item[] x=new Item[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the item details\nEnter the item id:");
			id=sc.nextInt();sc.nextLine();
			System.out.println("Enter the item name:");
			name=sc.nextLine();
			System.out.println("Enter the cost:");
			cost=sc.nextDouble();
			System.out.println("Enter the quantity:");
			quantity=sc.nextInt();
			x[i]=new Item();
			x[i].setItemId(id);
			x[i].setItemName(name);
			x[i].setCost(cost);
			x[i].setQuantity(quantity);
			s.addItem(x[i]);
		}
		
		System.out.println("Calculated Bill Amount: "+s.calculateTotalBill());
		
	}

}
