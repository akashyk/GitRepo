package my.com.init;

import my.com.algos.AssignmentsInterface;
import my.com.algos.AssignOneAhead;
import my.com.algos.ReverseOrderShiftMiddle;
import my.com.exceptions.ValidateInput;

public class SecretSantaHelper {

	// Orchestrate the game
	public void playSecretSanta() throws ValidateInput {

		final String[] participantList = new String[] { "Kyle", "Kenny",
				"Eric", "Stan", "Stewie", "Brian" };

		// Demonstrate AssignOneAhead algorithm
		System.out.println("======  Implementation AssignOneAhead  ======\n");
		AssignmentsInterface assignOneAhead = new AssignOneAhead();
		demonstrateAssignmentAlgos(assignOneAhead, participantList);

		final String[] evenParticipantList = new String[] { "Kyle", "Kenny",
				"Eric", "Stan", "Stewie", "Brian", "Peter" };

		// Demonstrate AssignOneAhead algorithm for an array with odd number of
		// names
		System.out
				.println("======  Implementation ReverseOrderShiftMiddle  ======\n");
		AssignmentsInterface reverseOrderShiftMiddle = new ReverseOrderShiftMiddle();
		demonstrateAssignmentAlgos(reverseOrderShiftMiddle, evenParticipantList);

		final String[] nonUniqueParticipantList = new String[] { "Kyle",
				"Kenny", "Kenny", "Eric", "Stan", "Stewie", "Brian", "Peter",
				"Peter" };
		// Demonstrate AssignOneAhead algorithm for non unique names
		demonstrateAssignmentAlgos(reverseOrderShiftMiddle,
				nonUniqueParticipantList);

	}

	private void demonstrateAssignmentAlgos(final AssignmentsInterface algos,
			String[] participantList) throws ValidateInput {
		final String[] assignment = algos.generateAssignments(participantList);
		algos.displayStringArrays(participantList, assignment);
	}

}