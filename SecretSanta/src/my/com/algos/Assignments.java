package my.com.algos;

import my.com.exceptions.ValidateInput;
import my.com.validate.ValidateInputs;

public abstract class Assignments implements AssignmentsInterface {

	// Implements two generic method required by all subclasses and the derived
	// classes
	// give their own implementation for abstract generateAssignments method

	ValidateInputs validate = new ValidateInputs();

	// Validates the array given by user
	public void validateUserInput(String[] participants) throws ValidateInput {
		validate.validateInputArray(participants);
	}

	// Displays two arrays matched per Secret Santa's rules
	public void displayStringArrays(String[] s1, String[] s2)
			throws ValidateInput {
		validate.validateDisplayArrays(s1, s2);
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i] + " is " + s2[i] + "'s secret Santa");
		}
		System.out
				.println("\n***************************************************************");
		System.out
				.println("***********************Merry Christmas*************************");
		System.out
				.println("***************************************************************\n\n");
	}

	// derived classes have to give their own implementation
	public abstract String[] generateAssignments(String[] participants)
			throws ValidateInput;
}
