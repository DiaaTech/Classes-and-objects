package diaatech;

public class Company {
	// Your code here
	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	public String CompanySize;
	public double Profit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	public String getCompanySize() {
		return CompanySize;
	}
	public void setCompanySize(String companySize) {
		if(numberOfEmployees<=50) {
			CompanySize = "small";
		}
		else if(numberOfEmployees>50 && numberOfEmployees<=250) {
			CompanySize = "medium";
		}
		else {
			CompanySize = "large";	
			
		}
		
	
	}
	public double getProfit() {
		return Profit;
	}
	public void setProfit(double profit) {
		if(profit >= 0) {
		Profit = revenue-expenses;
		}
		else {
			profit = expenses-revenue;
		}
	}

	
	

	

	
	
	
}
