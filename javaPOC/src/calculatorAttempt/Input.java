package calculatorAttempt;

import javax.swing.JOptionPane;

public class Input {
	
	private double first;
	private double second;
	private String operator;
	
	public double getFirstNumber(){
		String fn = JOptionPane.showInputDialog("Enter first number: ");
		first = Double.parseDouble(fn);
		return first;
	}

	public double getSecondNumber(){
		String sn = JOptionPane.showInputDialog("Enter second number: ");
		second = Double.parseDouble(sn);	
		return second;
	}
	
	public String getOperator(){
		String op = JOptionPane.showInputDialog("Enter operator (+,-,*,/): ");
		operator = op;
		return operator;
	}
	
	public String getAnother(){
		String another = JOptionPane.showInputDialog("Would you like to perform another calculation (Y/N)?");
		return another;
	}

}
