
package ee.x_road.kli_util_v1.producer;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.x_road.kli_util_v1.producer package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.x_road.kli_util_v1.producer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonLookup }
     * 
     */
    public PersonLookup createPersonLookup() {
        return new PersonLookup();
    }

    /**
     * Create an instance of {@link PersonLookupResponse }
     * 
     */
    public PersonLookupResponse createPersonLookupResponse() {
        return new PersonLookupResponse();
    }

    /**
     * Create an instance of {@link PersonLookup.Request }
     * 
     */
    public PersonLookup.Request createPersonLookupRequest() {
        return new PersonLookup.Request();
    }

    /**
     * Create an instance of {@link PersonLookupResponse.Request }
     * 
     */
    public PersonLookupResponse.Request createPersonLookupResponseRequest() {
        return new PersonLookupResponse.Request();
    }

    /**
     * Create an instance of {@link PersonLookupResponse.Response }
     * 
     */
    public PersonLookupResponse.Response createPersonLookupResponseResponse() {
        return new PersonLookupResponse.Response();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

}
