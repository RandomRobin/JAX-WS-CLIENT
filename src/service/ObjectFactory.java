
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerateAcceptGiroResponse_QNAME = new QName("http://service/", "generateAcceptGiroResponse");
    private final static QName _GenerateAcceptGiro_QNAME = new QName("http://service/", "generateAcceptGiro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerateAcceptGiroResponse }
     * 
     */
    public GenerateAcceptGiroResponse createGenerateAcceptGiroResponse() {
        return new GenerateAcceptGiroResponse();
    }

    /**
     * Create an instance of {@link GenerateAcceptGiro }
     * 
     */
    public GenerateAcceptGiro createGenerateAcceptGiro() {
        return new GenerateAcceptGiro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateAcceptGiroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "generateAcceptGiroResponse")
    public JAXBElement<GenerateAcceptGiroResponse> createGenerateAcceptGiroResponse(GenerateAcceptGiroResponse value) {
        return new JAXBElement<GenerateAcceptGiroResponse>(_GenerateAcceptGiroResponse_QNAME, GenerateAcceptGiroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateAcceptGiro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "generateAcceptGiro")
    public JAXBElement<GenerateAcceptGiro> createGenerateAcceptGiro(GenerateAcceptGiro value) {
        return new JAXBElement<GenerateAcceptGiro>(_GenerateAcceptGiro_QNAME, GenerateAcceptGiro.class, null, value);
    }

}
