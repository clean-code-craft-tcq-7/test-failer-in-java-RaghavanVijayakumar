public class alerterTest {
    static int networkAlertStub(float celcius) {
    	if(celcius>0) {
    		System.out.println("ALERT: Temperature is networkstub" + celcius + " celcius");
    		 return 200; 
    	}
    	return 500;
    }
    
    public static void main(String[] args) { 
    Alerter.alertInCelcius(400.5f,false);
    Alerter.alertInCelcius(303.6f,false);
    assert(Alerter.alertFailureCount==0);
    Alerter.alertInCelcius(-200.0f,false);
    assert(Alerter.alertFailureCount==1);
    Alerter.alertInCelcius(0, false);
    assert(Alerter.alertFailureCount==2);
    System.out.printf("%d alerts failed.\n", Alerter.alertFailureCount);
    System.out.println("All is well (maybe!)\n");
    }

}
