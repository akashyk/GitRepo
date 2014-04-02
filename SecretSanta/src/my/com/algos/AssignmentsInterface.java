package my.com.algos;

import my.com.exceptions.ValidateInput;

public interface AssignmentsInterface {
	public void validateUserInput(String[] participants) throws ValidateInput;

	public abstract String[] generateAssignments(String[] participants)
			throws ValidateInput;

	public void displayStringArrays(String[] participants,
			String[] participants2) throws ValidateInput;
}
