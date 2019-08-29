package ua.lviv.lgs.task1and3;

public class WrongInputConsoleParametersException extends Exception{
	
	private String wrongInput;

	public WrongInputConsoleParametersException(String wrongInput) {
		super(wrongInput);
		this.wrongInput = wrongInput;
	}

	public String getWrongInput() {
		return wrongInput;
	}
}
