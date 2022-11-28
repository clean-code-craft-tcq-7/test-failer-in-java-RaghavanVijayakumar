import tshirtsSizeTest;
public class tshirts{
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
		tshirtsSizeTest TshirtsSize = new tshirtsSizeTest();
		TshirtsSize.assertTShirtSize();
	}
}

