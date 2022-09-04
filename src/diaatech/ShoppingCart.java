package diaatech;

public class ShoppingCart {
	// Your code here
	private int totalNumberOfItems;
	private double totalAmountOwed;
    private double getAveragePricePerItem;
    private double addItems;
    private double empty;
    
	public double getAddItems() {
		return addItems;
	}
	public void setAddItems(double addItems) {
		
		this.addItems = addItems;
	}
	public double getEmpty() {
		return empty;
	}
	public void setEmpty(double empty) {
		this.empty = empty;
	}
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	public double getGetAveragePricePerItem() {
		return getAveragePricePerItem;
	}
	public void setGetAveragePricePerItem(double getAveragePricePerItem) {
		this.getAveragePricePerItem = totalAmountOwed / totalNumberOfItems;
	}
    
}

	

