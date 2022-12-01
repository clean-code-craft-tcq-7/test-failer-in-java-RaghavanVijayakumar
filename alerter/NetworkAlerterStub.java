public class NetworkAlerterStub implements AlerterInterface {
public	Integer sendTestRequest(float celcius) {
    	if(celcius>150) {
    		System.out.println("ALERT: Temperature is networkstub" + celcius + " celcius");
    		 return 500; 
    	}
    	return 200;
    }
}
