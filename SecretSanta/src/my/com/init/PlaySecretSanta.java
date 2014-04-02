package my.com.init;

import my.com.exceptions.ValidateInput;

public class PlaySecretSanta {

	public static void main(String[] args) {

		SecretSantaHelper play = new SecretSantaHelper();
		try {
			play.playSecretSanta();
		} catch (ValidateInput e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
