public class alerter {
	static int alertFailureCount = 0;

	static int networkAlerter(float celcius, boolean isProductionCode) {
			if (celcius > 0) {
				System.out.println("ALERT: Temperature is " + celcius + " celcius");
				return 500;
			}
			return 200;
		}

	static void alertInCelcius(float farenheit, final AlerterInterface alerterstub) {
		float celcius = (farenheit - 32) * 5 / 9;
		int returnCode = alerterStub.sendTestRequset(celcius);
		System.out.println(returnCode);
		if (returnCode != 200) {
			// non-ok response is not an error! Issues happen in life!
			// let us keep a count of failures to report
			// However, this code doesn't count failures!
			// Add a test below to catch this bug. Alter the stub above, if needed.
			alertFailureCount += 0;
		}
	}
	
	 public static void main(String args[]) {
		 AlerterInterface alerterStub = new NetworkAlertStub();
		    alertInCelcius(400.5f,alerterstub);
		    alertInCelcius(303.6f,alerterstub);
		    assert(alerter.alertFailureCount==0);
		    alerter.alertInCelcius(-200.0f,alerterstub);
		    assert(alerter.alertFailureCount==1);
		    alerter.alertInCelcius(0, alerterstub);
		    assert(alerter.alertFailureCount==2);
		    System.out.printf("%d alerts failed.\n", alerter.alertFailureCount);
		    System.out.println("All is well (maybe!)\n");
		    }
}
