import org.junit.jupiter.api.Test;

public class Tshirts {
	static String size(int cms) {
		if (cms < 38) {
			return "S";
		} else if (cms > 38 && cms < 42) {
			return "M";
		} else if(cms > 42) {
			return "L";
		}else
			return "INVALID";
	}

	@Test
	public void testsize() {
		assert (Tshirts.size(37) == "S");
		assert (Tshirts.size(38) == "INVALID");
		assert (Tshirts.size(40) == "M");
		assert (Tshirts.size(42) == "INVALID");
		assert (Tshirts.size(43) == "L");
		System.out.println("All is well (maybe!)");
	}
}
