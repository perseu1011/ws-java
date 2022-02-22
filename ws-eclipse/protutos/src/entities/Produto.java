package entities;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		
		
		//return  price * quantity;
		double totalValue = price * quantity;
		return totalValue;
		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
