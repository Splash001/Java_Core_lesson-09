package ua.lviv.lgs.task2;

public class Application {
	
	public static void main(String[] args) throws IllegalAccessException, MyException {
		
		double a = 1;
		double b = -5;
		
		Methods operations = new Methods();
		operations.adding(a,b);
		operations.division(a,b);
		operations.subtraction(a,b);
		operations.multiplication(a,b);
		
	}

}
