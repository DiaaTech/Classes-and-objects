package diaatech;

public class ShoppingCart {
	
	public int totalNumberOfItems;
	public double totalAmountOwed;
	
	
	public ShoppingCart() {
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0.0; 
	}
	
	
	 public double getAveragePricePerItem() {
		 return totalAmountOwed / totalNumberOfItems;
	 }
	 public void addItems(int numberOfItems, double pricePerItem) {
	   this.totalNumberOfItems = totalNumberOfItems + numberOfItems;
	   this.totalAmountOwed = totalAmountOwed + (pricePerItem * numberOfItems);
	 }
	    
	 public void empty() {
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0.0;
		 
	 }
}