import java.util.HashMap;

class CheckIfPermutationsIsPalindrome {

	public static boolean CheckPermIsPal(String perm) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < perm.length(); i++) {
			map.put(perm.charAt(i), map.getOrDefault(perm.charAt(i), 0) + 1);
		}
		int charCount = 0;
		for (char key : map.keySet()) {

			charCount += map.get(key) % 2;
		}

		System.out.println(perm.length());
		System.out.println(map.toString());
		return charCount <= 1;

	}

	public static void main(final String[] args) {

		String input = "carereagece";
		boolean result = CheckPermIsPal(input);
		System.out.println(result);
	}

}