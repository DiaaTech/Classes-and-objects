package diaatech;

import java.security.PublicKey;
import java.util.spi.CurrencyNameProvider;

public class Calculator {
	// Your code here

	public int currentValue;
	
	public Calculator() {
		this.currentValue = 0;
	}
	

	public int add(int addend) {
		currentValue = currentValue + addend;
			return currentValue;
	}
	
    public int multiply(int multiplier) {
    	currentValue = currentValue * multiplier;
    	return currentValue;
    }
    public int subtract(int subtrahend) {
    	currentValue = currentValue - subtrahend;
    	return currentValue;
    }
    
    public int power(int exponent) {
    	currentValue = currentValue^exponent;
    	return currentValue;
    }
    public void reset() {
    	 this.currentValue = 0;
    }
    }
