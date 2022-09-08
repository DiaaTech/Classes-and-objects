package diaatech;
import java.io.*;
import java.util.*;
public class ShoppingCart {
	// Your code here
	private int totalNumberOfItems;
	private double totalAmountOwed;
	public double  getGetAveragePricePerItem;
    private double empty;
    private double addItems;
	private int numberOfItems;
	int pricePerItem;
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
		return getGetAveragePricePerItem;
	}
	public void setGetAveragePricePerItem(double getGetAveragePricePerItem) {
		this.getGetAveragePricePerItem = totalAmountOwed / totalNumberOfItems;
	}
	public double getEmpty() {
		return empty;
	}
	public void setEmpty(double empty) {
		this.empty = empty;
	}
	
	public void setAddItems(int numberOfItems, double pricePerItem) {	
		this.addItems = totalNumberOfItems + (pricePerItem * numberOfItems);
		
	}
	public double getAddItems() {
		return addItems;
	}
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	public int getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(int pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	

	
	
	



    
}

	

