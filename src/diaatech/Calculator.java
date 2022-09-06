package diaatech;

public class Calculator {
	// Your code here
	private int Add;
	private int multiply;
	private int subtract;
	private int power;
	private int reset;
	private int x;
	private int y;


	public int getAdd() {
		return Add;
	}

	public void setAdd(int addend) {
		Add = x+y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    
	public int getMultiply() {
		return multiply;
	}

	public void setMultiply(int multiplier) {
		this.multiply = x*y;
	}

	public int getSubtract() {
		return subtract;
	}

	public void setSubtract(int subtrahend) {
		this.subtract = x-y;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int exponent) {
		
	      exponent =  (int)(Math.pow(x,y));
		  this.power= exponent;
	}

	public int getReset() {
		return reset;
	}

	public void setReset(int reset) {
		this.reset = 0;
	}
	
	}


 

