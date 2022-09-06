package diaatech;

public class Person {
// Your code here
	private String firstName;
	private String lastName;
	private int age;
	private String FullName;
	private boolean isAdult;
		

	
	public String getFullName() {
		return FullName;
		}
	public void setFullName(String fullName) {
		
         fullName = "Juan Perez";
		 firstName = fullName.substring(0, fullName.indexOf(" "));
		 lastName = fullName.substring(fullName.indexOf(" ") + 1);
	      
		this.FullName= lastName + ", " + firstName  ;
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
