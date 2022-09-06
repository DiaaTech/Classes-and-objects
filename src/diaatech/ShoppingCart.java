package diaatech;
import java.io.*;
import java.util.*;
public class ShoppingCart {
	// Your code here
	private int totalNumberOfItems;
	private double totalAmountOwed;
    private double getAveragePricePerItem;
    private double empty;
    private double addItems;
   
    public void setAddItems(int numberOfItems, double pricePerItem) {
    	 List<Integer> list = new ArrayList<Integer>();
   	     list.add(0);
    	  this.addItems =(totalNumberOfItems + (pricePerItem * numberOfItems));
    	 
    }
    
	public double getAddItems(int numberOfItems, double pricePerItem) {
		return addItems;
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

	

