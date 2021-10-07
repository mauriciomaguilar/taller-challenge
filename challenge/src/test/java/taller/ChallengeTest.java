package taller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTest {

	@Test
	public void validateSplitStringBy5With25Chars() {
		String str = "abcdefghijklmnopqrstuvwxy"; // length 25
		int split_number = 5;
		String[] expected = { "abcde", "fghij", "klmno", "pqrst", "uvwxy" };
		String[] actual = Challenge.splitString(str, split_number);

		assertArrays(expected, actual);
	}

	@Test
	public void validateSplitStringBy3With13Chars() {
		String str = "abcfdefghijkl"; // length 13
		int split_number = 3;
		String[] expected = { "abcf", "defg", "hijkl" };
		String[] actual = Challenge.splitString(str, split_number);
		assertArrays(expected, actual);

	}

	@Test
	public void validateSplitStringBy2With10Chars() {
		String str = "abcfdefghi"; // length 10
		int split_number = 2;
		String[] expected = { "abcfd", "efghi" };
		String[] actual = Challenge.splitString(str, split_number);
		assertArrays(expected, actual);

	}

	@Test
	public void validateSplitStringBy10With37Chars() {
		String str = "abiolsqusodpxlskdjwospwlszsoquesldkqu"; // length 37
		int split_number = 7;
		String[] expected = { "abiol", "squso", "dpxls", "kdjwo", "spwls", "zsoqu", "esldkqu" };
		String[] actual = Challenge.splitString(str, split_number);
		assertArrays(expected, actual);

	}

	private void assertArrays(String[] expected, String[] actual) {

		assertEquals(expected.length, actual.length);
		for (int i = 0; i < actual.length; i++) {
			assertEquals(expected[i], actual[i]);
		}

	}

}
