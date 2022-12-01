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
	
	public Misaligned assertMisAlignedTest(int i, int j) {
		int result = Misaligned.printColorMap();
		assert (result == 25);
		int colorpairnumber=((i*majorColors.length)+j+1);
		String colorpairno=Integer.toString(colorpairnumber);
		System.out.println("All is well (maybe!)");
		String colorPairStr;
		colorPairStr = Misaligned.getColorPair(i, j);
		assert (colorPairStr.contains(Misaligned.majorColors[i]) && colorPairStr.contains(Misaligned.minorColors[j]));
		assert (colorPairStr.contains(colorpairno));
		long count = colorPairStr.chars().filter(ch -> ch == '|').count();
		assert (count == 2);
		return this;
	}
	
	public static void main(String[] args) {
		Misaligned assertMisAlignedTest=new Misaligned();
		for(int i =0;i<5;i++){
			for(int j=0;j<5;j++){
		assertMisAlignedTest.assertMisAlignedTest(i, j);
			}
		}
	}
}
