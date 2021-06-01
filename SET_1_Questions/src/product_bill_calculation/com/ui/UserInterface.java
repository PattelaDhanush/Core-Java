package product_bill_calculation.com.ui;

import java.util.Scanner;



import product_bill_calculation.com.bean.Product;
import product_bill_calculation.com.utility.Shop;



public class UserInterface {

	public UserInterface() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of products");
		int n=sc.nextInt();
		int pid=0,quantity=0;
		double cost=0;
		String name="";
		Product[] p=new Product[n];
		Shop s=new Shop();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the product details\nEnter the product id:");
			pid=sc.nextInt();sc.nextLine();
			System.out.println("Enter the product name:");
			name=sc.nextLine();
			System.out.println("Enter the cost:");
			cost=sc.nextDouble();
			System.out.println("Enter the quantity:");
			quantity=sc.nextInt();
			p[i]=new Product();
			p[i].setProductId(pid);
			p[i].setProductName(name);
			p[i].setCost(cost);
			p[i].setQuantity(quantity);
			s.addProduct(p[i]);
		}
		System.out.println("Calculated Bill Amount: "+s.calculateTotalBill());
		

	}

}
