package my.com.algos;

import my.com.exceptions.ValidateInput;

public class ReverseOrderShiftMiddle extends Assignments {
	// As the name suggests move the elements of first array into the second
	// in reverse order and if the input is of odd number array, replace the
	// middle element with the middle-1 in the target before returning

	@Override
	public String[] generateAssignments(String[] participants)
			throws ValidateInput {

		// Validate input string array on success carry out assignment
		validateUserInput(participants);

		final String[] assignedParticipants = new String[participants.length];
		int arrLength = participants.length;
		float middle = arrLength / 2;

		for (int i = 0; i < arrLength; i++) {
			assignedParticipants[arrLength - i - 1] = participants[i];
		}

		if (middle > 0.0) {
			int midIndex = (int) middle;
			String temp = assignedParticipants[midIndex];
			assignedParticipants[midIndex] = assignedParticipants[midIndex - 1];
			assignedParticipants[midIndex - 1] = temp;
		}
		return assignedParticipants;
	}

}
