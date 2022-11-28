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
		TshirtsSizeTest tshirtsSizeTest = new TshirtsSizeTest();
		tshirtsSizeTest.assertTShirtSize();
	}
}

