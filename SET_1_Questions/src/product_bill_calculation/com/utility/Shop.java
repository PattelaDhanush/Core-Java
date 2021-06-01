package product_bill_calculation.com.utility;

import java.util.ArrayList;
import java.util.List;

import product_bill_calculation.com.bean.Product;



public class Shop {
	private List<Product> l=new ArrayList<>();
	public Shop() {
		super();
	}
	public List<Product> getProList(){
		return l;
	}
	public void setProList(List<Product> p) {
		this.l=p;
	}
	public void addProduct(Product p) {
		p.calculatDiscount();
		l.add(p);
		
		
	}
	public double calculateTotalBill() {
		
		if(l.size()==0)
			return -1;
		double totalBill=0;
		for(Product p:l) {
			totalBill+= (p.getCost()*p.getQuantity())-((p.getCost()*p.getQuantity()*p.getDiscount())/100);
		}
		return totalBill;
	}
}
