package my.com.exceptions;

public class ValidateInput extends Exception {

	private static final long serialVersionUID = 7045460355340052756L;

	// public ValidateInput(){}

	public ValidateInput(String msg) {
		super(msg);
	}
}
