/**
 * 
 */
package calculatorpkg;

/**
 * @author Sharon
 *
 */
public class CalculatorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		Calculator calculation = new Calculator(10,20);
		
		System.out.println("Value1 " + calculation.getValue1());
		System.out.println("Value2 " + calculation.getValue2());
		
		System.out.println("Testing pre-commit hook");
		
	}

}