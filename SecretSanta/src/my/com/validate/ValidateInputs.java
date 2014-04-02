package my.com.validate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import my.com.exceptions.ValidateInput;

public class ValidateInputs {

	// All validations
	public void validateInputArray(String[] arr) throws ValidateInput {

		// check if array is null, array has to have values to carry out the
		// game
		if (arr == null) {
			throw new ValidateInput(
					"Error try again: You entered no players, atleast three people or more needed to play Secret Santa ");
		}
		// There has to be three players at least to play the game
		// 2 participants will also violate the game rule
		if (arr.length < 3) {
			throw new ValidateInput(
					"Error try again: There has to be atleast three people or more to play Secret Santa, you have only "
							+ arr.length);
		}

		// Check for unique names in the input, non unique names cause conflicts
		// during assignments
		// and violates the game rule
		Set<String> hashArr = new HashSet<String>();
		List<String> duplicates = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if (!hashArr.add(arr[i]))
				duplicates.add(arr[i]); // gather all repeating names
		}
		// if any repeating names occur then flag error
		if (duplicates.size() > 0)
			throw new ValidateInput(
					"Error try again: The input names are not unique and has the following diplicate/s: "
							+ duplicates.toString());
	}

	public void validateDisplayArrays(String[] arr1, String[] arr2)
			throws ValidateInput {

		// Both arrays should have some values to display
		if (arr1 == null || arr2 == null) {
			throw new ValidateInput("Error: One or both Input arrays are null!");
		}

		// Both arrays have to be of same size to ensure assignment is
		// successful
		if (arr1.length != arr2.length) {
			throw new ValidateInput("Error: Input arrays not of same size!");
		}
	}

}
