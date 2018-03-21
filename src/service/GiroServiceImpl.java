
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GiroServiceImpl", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GiroServiceImpl {


    /**
     * 
     * @param name
     * @param adres
     * @param bedrag
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generateAcceptGiro", targetNamespace = "http://service/", className = "service.GenerateAcceptGiro")
    @ResponseWrapper(localName = "generateAcceptGiroResponse", targetNamespace = "http://service/", className = "service.GenerateAcceptGiroResponse")
    @Action(input = "http://service/GiroServiceImpl/generateAcceptGiroRequest", output = "http://service/GiroServiceImpl/generateAcceptGiroResponse")
    public int generateAcceptGiro(
        @WebParam(name = "name")
        String arg0,
        @WebParam(name = "adres")
        String arg1,
        @WebParam(name = "bedrag")
        float arg2);

}