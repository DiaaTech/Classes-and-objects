package diaatech;

import java.security.PublicKey;

public class Dog {

	
	public boolean sleeping; 
	
		
	public Dog () {
		this.sleeping = false;
	
	}
	 public String makeSound() {
		 if (this.sleeping = true) {
			 return "Zzzzz";
		 }
		 return "Woof!";
	 }
	 
     public void sleep() {
    	
    	sleeping = true;
     }
    
    public void wakeUp() {
    	
    	sleeping = false;
    }
    

	// Your code here
	   // - `makeSound()` returns `"..."` if the dog is asleep. Returns `"Woof!"` if the dog is awake.
	   // - `sleep()` sets `sleeping` to `true`.
	//    - `wakeUp()` sets `sleeping` to `false`.

}
