package product_bill_calculation.com.bean;

public class Product {
	private int productId;
	private String productName;
	private double cost;
	private int quantity;
	private int discount;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Product() {
		super();
	}
	
	
	public void calculatDiscount() {
		double totalPrice = this.cost*this.quantity;
		if(totalPrice>1000)
			this.discount=20;
		else if(totalPrice>=500)
			this.discount=10;
		else
			this.discount=0;
	}
	
}
