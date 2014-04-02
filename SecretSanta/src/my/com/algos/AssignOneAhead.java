package my.com.algos;

import my.com.exceptions.ValidateInput;

public class AssignOneAhead extends Assignments {
	// As the name suggests -- shift one element down into the target array
	// and place the last of the source into the first position of target array

	/**
	 * @param participants
	 *            list of individuals participating in the draw.
	 * @return the list of individuals paired with the participants where
	 *         participants[0] is matched with assignments[0], participants[1]
	 *         is matched with assignments[1], and so on.
	 * @throws ValidateInput
	 * @throws SecretSantaValidationException
	 */
	public String[] generateAssignments(String[] participants)
			throws ValidateInput {

		// Validate input string array on success carry out assignment
		validateUserInput(participants);

		int arrLength = participants.length;
		int count = 1;
		final String[] assignedParticipants = new String[participants.length];

		while (count < arrLength) {
			assignedParticipants[count] = participants[count - 1];
			count++;
		}
		assignedParticipants[0] = participants[count - 1];
		return assignedParticipants;
	}
}
