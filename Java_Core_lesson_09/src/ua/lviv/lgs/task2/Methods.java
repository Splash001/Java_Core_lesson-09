package ua.lviv.lgs.task2;

public class Methods {
	
	private double a;
	private double b;
	
	static void  adding(double a, double b) throws MyException, IllegalAccessException {
		
		if (a<0 && b<0) {
			throw new IllegalArgumentException("You shouldn't do this");
		} else if(a<=0 && b!=0 || a!=0 && b<=0) {
			throw new ArithmeticException("My eyes hurt");
		} else if(a<=0 && b<=0) {
			throw new IllegalAccessException("Took You 20 years to figure out?");
		} else if(a>0 && b>0) {
			throw new MyException("Something went wrong");
		} else {
		System.out.println("The sum a of and b is = " + (a + b));
		}
	}
	
	public void  subtraction(double a, double b) throws IllegalAccessException, MyException {
		if (a<0 && b<0) {
			throw new IllegalArgumentException();
		} else if(a<=0 && b!=0 || a!=0 && b<=0) {
			throw new ArithmeticException();
		} else if(a<=0 && b<=0) {
			throw new IllegalAccessException();
		} else if(a>0 && b>0) {
			throw new MyException("Something went wrong");
		} else {
		System.out.println("The subtraction a of and b is = " + (a - b));
		}
	}
	
	public void  multiplication(double a, double b) throws MyException, IllegalAccessException {
		if (a<0 && b<0) {
			throw new IllegalArgumentException();
		} else if(a<=0 && b!=0 || a!=0 && b<=0) {
			throw new ArithmeticException();
		} else if(a<=0 && b<=0) {
			throw new IllegalAccessException();
		} else if(a>0 && b>0) {
			throw new MyException("Something went wrong");
		} else {
		System.out.println("The multiplication a of and b is = " + (a * b));
		}
	}
	
	public void  division(double a, double b) throws IllegalAccessException, MyException  {
		if (a<0 && b<0) {
			throw new IllegalArgumentException();
		} else if(a<=0 && b!=0 || a!=0 && b<=0) {
			throw new ArithmeticException();
		} else if(a<=0 && b<=0) {
			throw new IllegalAccessException();
		} else if(a>0 && b>0) {
			throw new MyException("Something went wrong");
		} else {
		System.out.println("The divison a of and b is = " + (a / b));
		}
	}

}
