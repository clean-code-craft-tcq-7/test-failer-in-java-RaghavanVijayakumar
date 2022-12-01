
public class Tshirts {
	static String size(int cms) {
		if (cms < 38) {
			return "S";
		} else if (cms > 38 && cms < 42) {
			return "M";
		} else {
			return "L";
		}
	}

	public static void main(String[] args) {
		assert (Tshirts.size(37) == "S");
		assert (Tshirts.size(38) == "M");
		assert (Tshirts.size(40) == "M");
		 assert(Tshirts.size(42) == "L");
		assert (Tshirts.size(43) == "L");
		assert (Tshirts.size(-50) != "S");
		System.out.println("All is well (maybe!)");
	}
}
