package item_bill_calculation.com.utility;

import java.util.ArrayList;
import java.util.List;

import item_bill_calculation.com.bean.Item;

public class Shop {

	private List<Item> itemList=new ArrayList<>();
	public Shop() {
		super();
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	public void addItem(Item i) {
		i.setCategory("");
		itemList.add(i);
	}
	
	public double calculateTotalBill() {
		if(itemList.size()==0)
		return -1;
		double total=0,price=0;
		for(Item i:itemList) {
			price=i.getCost()*i.getQuantity();
			if(i.getCategory().equals("A"))
				total+=price*1.05;
			else if(i.getCategory().equals("B"))
				total+=price*1.1;
			else
				total+=price*1.15;
		}
		return total;
	}
}
