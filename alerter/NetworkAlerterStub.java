public class NetworkAlerterStub implements AlerterInterface {
static int networkAlertStub(float celcius) {
    	if(celcius>200) {
    		System.out.println("ALERT: Temperature is networkstub" + celcius + " celcius");
    		 return 500; 
    	}
    	return 200;
    }
