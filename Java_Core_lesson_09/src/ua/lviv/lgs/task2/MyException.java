package ua.lviv.lgs.task2;

public class MyException extends Exception {
	
	private String randomError;

	public String getRandomError() {
		return randomError;
	}

	public MyException(String randomError) {
		super(randomError);
		this.randomError = randomError;
	}
}
