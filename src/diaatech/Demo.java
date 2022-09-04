package diaatech;

public class Demo {
      
	public static void main(String[] args) {
		//answer no1.
		
		Company myCompany=new Company();
		myCompany.setName("myCompany");
		myCompany.setNumberOfEmployees(300);
		myCompany.setRevenue(100);
		myCompany.setExpenses(20);
		myCompany.setCompanySize("large");
		myCompany.setProfit(0);
	
	
        System.out.println(myCompany.getName());
        System.out.println(myCompany.getNumberOfEmployees());
        System.out.println(myCompany.getRevenue());
        System.out.println(myCompany.getExpenses());
        System.out.println(myCompany.getCompanySize()); 
        System.out.println(myCompany.getProfit());
        



		//answer no.2
		/*
		Person myPerson = new Person();
		myPerson.setFullName("FullName");
		myPerson.setFirstName("khaled");
		myPerson.setlastName("Anwar");
		myPerson.setAge(25);
		myPerson.setisAdult(true);
		
		
		 System.out.println(myPerson.getFullName());
		 System.out.println(myPerson.getFirstName());
		 System.out.println(myPerson.getlastName());
		 System.out.println(myPerson.getAge());
		 System.out.println(myPerson.getisAdult());
	*/

		
		// answer 3.
		/*
		Product myProduct = new Product();
		myProduct.setName("khaled");
		myProduct.setPrice(20.00);
		myProduct.setWeightInOunces(10.00);
		
		 System.out.println(myProduct.getName());
		 System.out.println(myProduct.getPrice());
		 System.out.println(myProduct.getWeightInOunces());
		 */
		//answer no.4
		/*
		Dog myDog = new Dog();
		myDog.setSleeping(true);
		myDog.setMakeSound("sleeping");
		myDog.setWakeUp(false);
		
		 System.out.println(myDog.getMakeSound());
		 System.out.println(myDog.isSleeping());
		 System.out.println(myDog.getWakeUp());
		 */
		//answer 5.
		/*
		ShoppingCart  myShoppingCart = new ShoppingCart();
		
		myShoppingCart.setTotalAmountOwed(80.00);
		myShoppingCart.setTotalNumberOfItems(20);
		myShoppingCart.setGetAveragePricePerItem(2);
	
		 System.out.println(myShoppingCart.getTotalAmountOwed());
		 System.out.println(myShoppingCart.getTotalNumberOfItems());
		 System.out.println(myShoppingCart.getGetAveragePricePerItem());
		//answer 6.
		/*
		Calculator myCalculator=new Calculator();
		myCalculator.setCurrentValue(0);
		
		 System.out.println(myCalculator.getCurrentValue());
		*/
	}
}

