package calculatorAttempt;

public class Calculator{
	
	Input userInput = new Input();
	
	double firstNo = userInput.getFirstNumber();
	double secondNo = userInput.getSecondNumber();
	
	public double addition(){
		return firstNo + secondNo;
	}
	
	public double subtraction(){
		return firstNo - secondNo;
	}
	
	public double multiplication(){
		return firstNo * secondNo;
	}
	
	public double division(){
		return firstNo / secondNo;
	}
}
