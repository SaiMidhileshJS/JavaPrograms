package simpleJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class CharacterCount {

	// automation -> a=2, u=1, t=2, o=2, m=1, i=1, n=1

	public static Set<String> characterCount(String stringText) {

		Set<String> characters = new HashSet<>();

		String newStringText = stringText.trim().toUpperCase();

		for (int i = 0; i <= newStringText.length() - 1; i++) {

			if (newStringText.charAt(i) != ' ') {
				int count = 0;
				for (int j = 0; j <= newStringText.length() - 1; j++) {

					if (newStringText.charAt(i) == newStringText.charAt(j))
						count++;
				}

				characters.add(newStringText.charAt(i) + " = " + count);
			}

		}

		return characters;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(characterCount("Midhilesh"));
	}

}
