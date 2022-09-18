package diaatech;


public class Person {

	
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	public String getFullName() {
	//	- `getFullName()` returns the `lastName` + ", " + `firstName`.
	//	- `isAdult()` returns `true` if the person is 18 or older.
		
		return lastName + "," + firstName;
		
	}
	
	
	
    public boolean isAdult() {
    	if (age >=18) {
    		return true;
    		
    	}
    	return false;
    		
    	
    }

	

	// Your code here
}
