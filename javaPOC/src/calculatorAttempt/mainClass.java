package calculatorAttempt;

import javax.swing.JOptionPane;

public class mainClass {

	public static void main(String[] args) {
		
		String another;
		
		do {
			Input userinput = new Input();
			Calculator calc = new Calculator();
			String operatorEntered = userinput.getOperator();
			
			if (operatorEntered.equals("+"))
				JOptionPane.showMessageDialog(null,
						"The sum is: " + calc.addition(), 
						"The Calculator",
						JOptionPane.PLAIN_MESSAGE);

			else if (operatorEntered.equals("-"))
				JOptionPane.showMessageDialog(null,
						"The sum is: " + calc.subtraction(), 
						"The Calculator",
						JOptionPane.PLAIN_MESSAGE);

			else if (operatorEntered.equals("*"))
				JOptionPane.showMessageDialog(null,
						"The sum is: " + calc.multiplication(),
						"The Calculator", 
						JOptionPane.PLAIN_MESSAGE);

			else if (operatorEntered.equals("/"))
				JOptionPane.showMessageDialog(null,
						"The sum is: " + calc.division(), 
						"The Calculator",
						JOptionPane.PLAIN_MESSAGE);
				
			else
				JOptionPane.showMessageDialog(null,
						"You have entered an invalid operator",
						"The Calculator", 
						JOptionPane.PLAIN_MESSAGE);		
			
			another = userinput.getAnother();
			
		} while (another.equals("Y"));
	}
}
