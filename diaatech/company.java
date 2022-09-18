package diaatech;


public class company {
	// Your code here
	
	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	public String getCompanySize() {
		
		if (numberOfEmployees > 50) {
			return "small";
		}
			
		if ( numberOfEmployees >= 51 && numberOfEmployees < 250) {
			return "medium";
		}
	
		return "large";
	}			
	
	public double getProfit() {
		
		return revenue - expenses;
	}

}
