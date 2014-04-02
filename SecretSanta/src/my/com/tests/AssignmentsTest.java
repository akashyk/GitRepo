package my.com.tests;

import static org.junit.Assert.assertArrayEquals;
import my.com.algos.AssignOneAhead;
import my.com.algos.AssignmentsInterface;
import my.com.algos.ReverseOrderShiftMiddle;
import my.com.exceptions.ValidateInput;

import org.junit.Test;

public class AssignmentsTest {

	AssignmentsInterface assignmentAlgorithm;

	@Test
	public void testAssignOneAhead() throws ValidateInput {

		String[] input = { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian",
				"Peter" };
		String[] output = { "Peter", "Kyle", "Kenny", "Eric", "Stan", "Stewie",
				"Brian" };
		assignmentAlgorithm = new AssignOneAhead();
		assertArrayEquals(assignmentAlgorithm.generateAssignments(input),
				output);
	}

	@Test
	public void testReverseOrderShiftMiddle() throws ValidateInput {
		String[] input = { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian",
				"Peter" };
		String[] output = { "Peter", "Brian", "Stan", "Stewie", "Eric",
				"Kenny", "Kyle" };
		assignmentAlgorithm = new ReverseOrderShiftMiddle();
		assertArrayEquals(assignmentAlgorithm.generateAssignments(input),
				output);
	}

}
