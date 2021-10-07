package taller;

public class Challenge {
	public static String[] splitString(String str1, int n) {

		int stringSize = str1.length();
		String[] stringParts = null;
		if (n > stringSize) {
			System.out.println("The split number should be less than string size! ");
		} else {

			int partsSize = stringSize / n;
			stringParts = new String[n];
			int count = 0;

			for (int i = 0; i < stringSize; i = i + partsSize) {

				if (i + partsSize > stringSize) {
					stringParts[count - 1] = stringParts[count - 1].concat(str1.substring(i, stringSize));
					break;
				}

				String part = str1.substring(i, i + partsSize);
				stringParts[count] = part;
				count++;
			}

			System.out.println("###########");
			for (int i = 0; i < stringParts.length; i++) {
				System.out.println(stringParts[i]);
			}
		}
		return stringParts;
	}
}
