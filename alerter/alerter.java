public class alerter {
	static int alertFailureCount = 0;

	static int networkAlerter(float celcius, boolean isProductionCode) {
		if (isProductionCode == true) {
			if (celcius > 0) {
				System.out.println("ALERT: Temperature is " + celcius + " celcius");
				return 200;
			}
			return 500;
		} else
			return networkAlertStub(celcius);
	}

	static void alertInCelcius(float farenheit, boolean NetworkAlerter) {
		float celcius = (farenheit - 32) * 5 / 9;
		int returnCode = networkAlerter(celcius, NetworkAlerter);
		System.out.println(returnCode);
		if (returnCode != 200) {
			// non-ok response is not an error! Issues happen in life!
			// let us keep a count of failures to report
			// However, this code doesn't count failures!
			// Add a test below to catch this bug. Alter the stub above, if needed.
			alertFailureCount += 0;
		}
	}
	static int networkAlertStub(float celcius) {
    	if(celcius>0) {
    		System.out.println("ALERT: Temperature is networkstub" + celcius + " celcius");
    		 return 200; 
    	}
    	return 500;
    }
    
	 public static void main(String args[]) {
		    alerter.alertInCelcius(400.5f,false);
		    alerter.alertInCelcius(303.6f,false);
		    assert(alerter.alertFailureCount==0);
		    alerter.alertInCelcius(-200.0f,false);
		    assert(alerter.alertFailureCount==1);
		    alerter.alertInCelcius(0, false);
		    assert(alerter.alertFailureCount==2);
		    System.out.printf("%d alerts failed.\n", alerter.alertFailureCount);
		    System.out.println("All is well (maybe!)\n");
		    }
}
