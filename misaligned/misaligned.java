public class Misaligned {
	static String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
	static String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	static int printColorMap() {
		int i = 0, j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf(getColorPair(i, j));
			}
		}
		return i * j;
	}

	static String getColorPair(int i, int j) {
		return String.format("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i]);
	}
}
