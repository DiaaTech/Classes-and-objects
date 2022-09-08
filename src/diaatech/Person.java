package diaatech;

public class Person {
// Your code here
	private String firstName;
	private String lastName;
	private int age;
	private String getfullName;
	private boolean isAdult;
		

	
	public String getFullName() {
		return getfullName=lastName + ", " + firstName;
		}
	
	public boolean getisAdult() {
		return isAdult;
	}
	public void setisAdult(boolean isAdult) {
		if(age >=18) {
			this.isAdult = true;
		}
		else {
			this.isAdult = false;
		}
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
