import org.junit.jupiter.api.Test;

public class MisalignedTest {

	public MisalignedTest assertMisAlignedTest(int i, int j) {
		int result = Misaligned.printColorMap();
		assert (result == 25);
		System.out.println("All is well (maybe!)");
		String colorPairStr;
		colorPairStr = Misaligned.getColorPair(i, j);
		assert (colorPairStr.contains(Misaligned.majorColors[i]) && colorPairStr.contains(Misaligned.minorColors[j]));
		assert (colorPairStr.contains("21"));
		long count = colorPairStr.chars().filter(ch -> ch == '|').count();
		assert (count == 2);
		return this;
	}

	@Test
	public void testdifferentcolorpair() {
		assertMisAlignedTest(4, 0);
		assertMisAlignedTest(2, 1);
		assertMisAlignedTest(1, 1);
		assertMisAlignedTest(3, 3);
	}
}
