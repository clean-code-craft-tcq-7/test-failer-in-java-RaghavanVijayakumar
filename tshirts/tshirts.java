public class Tshirts {
	static String size(int cms) {
		if (cms <= 38) {
			return "S";
		} else if (cms > 38 && cms < 42) {
			return "M";
		} else if (cms => 42) {
			return "L";
		} else
			return "INVALID";
	}

	public static void main(String args[]) {
		assert (Tshirts.size(37) == "S");
		assert (Tshirts.size(38) == "S");
		assert (Tshirts.size(40) == "M");
		assert (Tshirts.size(42) == "L");
		assert (Tshirts.size(43) == "L");
		assert (Tshirts.size("-50") == "INVALID");
		System.out.println("All is well (maybe!)");
	}
}
