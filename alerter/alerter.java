public class alerter{
	static int alertFailureCount = 0;

	static int networkAlerter(float celcius) {
		if (celcius > 0) {
			System.out.println("ALERT: Temperature is " + celcius + " celcius");
			return 500;
		}
		return 200;
	}

	static void alertInCelcius(float farenheit, final AlerterInterface alerterStub) {
		float celcius = (farenheit - 32) * 5 / 9;
		int returnCode = alerterStub.sendTestRequest(celcius);
		System.out.println(returnCode);
		if (returnCode != 200) {
			// non-ok response is not an error! Issues happen in life!
			// let us keep a count of failures to report
			// However, this code doesn't count failures!
			// Add a test below to catch this bug. Alter the stub above, if needed.
			alertFailureCount += 0;
		}
	}

		public	Integer sendTestRequest(float celcius) {
    	if(celcius>150) {
    		System.out.println("ALERT: Temperature is networkstub" + celcius + " celcius");
    		 return 500; 
    	}
    	return 200;
    }
	
	public static void main(String args[]) {
		AlerterInterface alerterStub = new NetworkAlerterStub();
		alertInCelcius(400.5f, alerterStub);
		assert (alerter.alertFailureCount == 1);
		alertInCelcius(303.6f, alerterStub);
		assert (alerter.alertFailureCount == 2);
		alertInCelcius(200.0f, alerterStub);
		assert (alerter.alertFailureCount == 2);
		alertInCelcius(100, alerterStub);
		assert (alerter.alertFailureCount == 2);
		alertInCelcius(-200, alerterStub);
		assert (alerter.alertFailureCount == 2);
		System.out.printf("%d alerts failed.\n", alerter.alertFailureCount);
		System.out.println("All is well (maybe!)\n");
	}
}
