package diaatech;

public class Dog {
// Your code here
	private boolean sleeping;
	public String MakeSound;
	public boolean wakeUp;
	
	public boolean getWakeUp() {
		return wakeUp;
	}
	public void setWakeUp(boolean wakeUp) {
		if(sleeping) {
		this.wakeUp = false;
		}
	}
		
	
	public boolean isSleeping() {
		return sleeping;
	}
	public void setSleeping(boolean sleeping) {
		if(sleeping)
		this.sleeping = true;
	}
	public String getMakeSound() {
		
		return MakeSound;
	}
	public void setMakeSound(String makeSound) {
		if(sleeping) {
		this.MakeSound = "zzzzzz......";
		}
		else {
			this.MakeSound = "Woof!";
		}
	}
	
	
	}


