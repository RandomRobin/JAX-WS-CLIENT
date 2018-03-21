package service;

public class SoapCallerImpl implements SoapCaller{
	public int getGiroAccept(String naam, String adres, float bedrag) {
		  GiroServiceImpl webservice = new GiroServiceImplService().getGiroServiceImplPort();
	       int response = webservice.generateAcceptGiro(naam, adres, bedrag);
	       return response;
	}
	

}
