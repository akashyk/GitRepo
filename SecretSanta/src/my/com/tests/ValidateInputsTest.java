package my.com.tests;

import my.com.exceptions.ValidateInput;
import my.com.validate.ValidateInputs;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValidateInputsTest {

	private ValidateInputs validate = new ValidateInputs();
	String errorMessage = null;
	String input = null;

	@Before
	public void setUp() throws Exception {
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testNullArrayInput() throws ValidateInput {

		String[] input = null;
		errorMessage = "Error try again: You entered no players, atleast three people or more needed to play Secret Santa ";
		thrown.expect(ValidateInput.class);
		thrown.expectMessage(errorMessage);
		validate.validateInputArray(input);
	}

	@Test
	public void testLesserInput() throws ValidateInput {

		String[] input = { "Kenny", "Stewie" };
		errorMessage = "Error try again: There has to be atleast three people or more to play Secret Santa, you have only "
				+ input.length;
		thrown.expect(ValidateInput.class);
		thrown.expectMessage(errorMessage);
		validate.validateInputArray(input);
	}

	@Test
	public void testInputContentUniqueness() throws ValidateInput {

		String[] input = { "Kyle", "Kenny", "Kenny", "Eric", "Stan", "Stewie",
				"Brian", "Peter", "Peter" };
		errorMessage = "Error try again: The input names are not unique and has the following diplicate/s: [Kenny, Peter]";
		thrown.expect(ValidateInput.class);
		thrown.expectMessage(errorMessage);
		validate.validateInputArray(input);
	}

	@Test
	public void testValidateDisplayArrays() throws ValidateInput {

		String[] input = { "Kyle", "Kenny", "Kenny", "Eric", "Stan", "Stewie",
				"Brian", "Peter", "Peter" };
		errorMessage = "Error try again: The input names are not unique and has the following diplicate/s: [Kenny, Peter]";
		thrown.expect(ValidateInput.class);
		thrown.expectMessage(errorMessage);
		validate.validateInputArray(input);
	}

	@Test
	public void validateDisplayArraysDifferentSize() throws ValidateInput {
		String[] input1 = { "Kyle", "Kenny", "Kenny", "Eric", "Stan", "Stewie",
				"Brian", "Peter", "Peter" };
		String[] input2 = { "Kyle", "Kenny" };

		errorMessage = "Error: Input arrays not of same size!";
		thrown.expect(ValidateInput.class);
		thrown.expectMessage(errorMessage);
		validate.validateDisplayArrays(input1, input2);

	}

	@Test
	public void validateDisplayArraysOneIsNull() throws ValidateInput {
		String[] input1 = { "Kyle", "Kenny", "Kenny", "Eric", "Stan", "Stewie",
				"Brian", "Peter", "Peter" };
		String[] input2 = null;

		errorMessage = "Error: One or both Input arrays are null!";
		thrown.expect(ValidateInput.class);
		thrown.expectMessage(errorMessage);
		validate.validateDisplayArrays(input1, input2);
	}

	@Test
	public void validateDisplayArraysBothAreNull() throws ValidateInput {
		String[] input1 = null;
		String[] input2 = null;

		errorMessage = "Error: One or both Input arrays are null!";
		thrown.expect(ValidateInput.class);
		thrown.expectMessage(errorMessage);
		validate.validateDisplayArrays(input1, input2);
	}
}
