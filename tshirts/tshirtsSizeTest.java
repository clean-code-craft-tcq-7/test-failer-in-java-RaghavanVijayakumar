public class TshirtsSizeTest {

	public void assertTShirtSize() {
		assert (Tshirts.size(37) == "S");
		assert (Tshirts.size(38) == "M");
		assert (Tshirts.size(40) == "M");
		assert (Tshirts.size(43) == "L");
		assert (Tshirts.size(0) != "S");
		assert (Tshirts.size(-50) != "S");
		System.out.println("All is well (maybe!)");
	}
}
