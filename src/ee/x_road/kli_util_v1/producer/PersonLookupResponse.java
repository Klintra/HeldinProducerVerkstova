
package ee.x_road.kli_util_v1.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="faultCode" type="{http://x-road.ee/xsd/x-road.xsd}faultCode"/&gt;
 *                   &lt;element name="faultString" type="{http://x-road.ee/xsd/x-road.xsd}faultString"/&gt;
 *                   &lt;element name="PersonLookupResponse" type="{http://kli-util-v1.x-road.ee/producer}Person" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "response"
})
@XmlRootElement(name = "personLookupResponse")
public class PersonLookupResponse {

    @XmlElement(required = true)
    protected PersonLookupResponse.Request request;
    @XmlElement(required = true)
    protected PersonLookupResponse.Response response;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link PersonLookupResponse.Request }
     *     
     */
    public PersonLookupResponse.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonLookupResponse.Request }
     *     
     */
    public void setRequest(PersonLookupResponse.Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link PersonLookupResponse.Response }
     *     
     */
    public PersonLookupResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonLookupResponse.Response }
     *     
     */
    public void setResponse(PersonLookupResponse.Response value) {
        this.response = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class Request {

        protected int id;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="faultCode" type="{http://x-road.ee/xsd/x-road.xsd}faultCode"/&gt;
     *         &lt;element name="faultString" type="{http://x-road.ee/xsd/x-road.xsd}faultString"/&gt;
     *         &lt;element name="PersonLookupResponse" type="{http://kli-util-v1.x-road.ee/producer}Person" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "faultCode",
        "faultString",
        "personLookupResponse"
    })
    public static class Response {

        @XmlElement(required = true, nillable = true)
        protected String faultCode;
        @XmlElement(required = true, nillable = true)
        protected String faultString;
        @XmlElement(name = "PersonLookupResponse")
        protected Person personLookupResponse;

        /**
         * Gets the value of the faultCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaultCode() {
            return faultCode;
        }

        /**
         * Sets the value of the faultCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaultCode(String value) {
            this.faultCode = value;
        }

        /**
         * Gets the value of the faultString property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaultString() {
            return faultString;
        }

        /**
         * Sets the value of the faultString property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaultString(String value) {
            this.faultString = value;
        }

        /**
         * Gets the value of the personLookupResponse property.
         * 
         * @return
         *     possible object is
         *     {@link Person }
         *     
         */
        public Person getPersonLookupResponse() {
            return personLookupResponse;
        }

        /**
         * Sets the value of the personLookupResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link Person }
         *     
         */
        public void setPersonLookupResponse(Person value) {
            this.personLookupResponse = value;
        }

    }

}
