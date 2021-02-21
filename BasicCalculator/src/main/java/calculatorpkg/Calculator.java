/**
 *	Calculator Package 
 */
package calculatorpkg;

/**
 * @author Sharon
 * 
 * @version 0.1
 * 
 * Basic calculator class
 *
 */
public class Calculator {
	
	private double value1;
	private double value2;
	
	/**
	 * @param value1 holds the first number in the calculation
	 * @param value2 holds the second number in the calculation
	 */
	public Calculator(double value1, double value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	/**
	 * @return the value1
	 */
	public double getValue1() {
		return value1;
	}
	/**
	 * @param value1 the value1 to set
	 */
	public void setValue1(double value1) {
		this.value1 = value1;
	}
	/**
	 * @return the value2
	 */
	public double getValue2() {
		return value2;
	}
	/**
	 * @param value2 the value2 to set
	 */
	public void setValue2(double value2) {
		this.value2 = value2;
	}
	
	
	

}
