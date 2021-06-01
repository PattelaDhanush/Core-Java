package item_bill_calculation.com.bean;

public class Item {
	private int itemId;
	private String itemName;
	private double cost;
	private int quantity;
	private String category;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		double totalPrice=cost*quantity;
		if(totalPrice<5000)
			this.category="C";
		else if(totalPrice<=10000)
			this.category="B";
		else 
			this.category="A";
			
	}
	public Item() {
		super();
		
	}
	
	
}
