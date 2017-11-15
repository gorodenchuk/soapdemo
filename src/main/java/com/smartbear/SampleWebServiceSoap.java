
package com.smartbear;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SampleWebServiceSoap", targetNamespace = "http://smartbear.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SampleWebServiceSoap {


    /**
     * This method returns a string value.
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld", action = "http://smartbear.com/HelloWorld")
    @WebResult(name = "HelloWorldResult", targetNamespace = "http://smartbear.com")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://smartbear.com", className = "com.smartbear.HelloWorld")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://smartbear.com", className = "com.smartbear.HelloWorldResponse")
    public String helloWorld();

    /**
     * This method returns an array of integer values.
     * 
     * @return
     *     returns com.smartbear.ArrayOfInt
     */
    @WebMethod(operationName = "GetArray", action = "http://smartbear.com/GetArray")
    @WebResult(name = "GetArrayResult", targetNamespace = "http://smartbear.com")
    @RequestWrapper(localName = "GetArray", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetArray")
    @ResponseWrapper(localName = "GetArrayResponse", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetArrayResponse")
    public ArrayOfInt getArray();

    /**
     * This method returns the current system time.
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod(operationName = "GetCurrentTime", action = "http://smartbear.com/GetCurrentTime")
    @WebResult(name = "GetCurrentTimeResult", targetNamespace = "http://smartbear.com")
    @RequestWrapper(localName = "GetCurrentTime", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetCurrentTime")
    @ResponseWrapper(localName = "GetCurrentTimeResponse", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetCurrentTimeResponse")
    public XMLGregorianCalendar getCurrentTime();

    /**
     * This method returns an object.
     * 
     * @param no
     * @return
     *     returns com.smartbear.SampleTestClass
     */
    @WebMethod(operationName = "GetSampleObject", action = "http://smartbear.com/GetSampleObject")
    @WebResult(name = "GetSampleObjectResult", targetNamespace = "http://smartbear.com")
    @RequestWrapper(localName = "GetSampleObject", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetSampleObject")
    @ResponseWrapper(localName = "GetSampleObjectResponse", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetSampleObjectResponse")
    public SampleTestClass getSampleObject(
        @WebParam(name = "no", targetNamespace = "http://smartbear.com")
        int no);

    /**
     * This method uses an object as a parameter.
     * 
     * @param obj
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SetSampleObject", action = "http://smartbear.com/SetSampleObject")
    @WebResult(name = "SetSampleObjectResult", targetNamespace = "http://smartbear.com")
    @RequestWrapper(localName = "SetSampleObject", targetNamespace = "http://smartbear.com", className = "com.smartbear.SetSampleObject")
    @ResponseWrapper(localName = "SetSampleObjectResponse", targetNamespace = "http://smartbear.com", className = "com.smartbear.SetSampleObjectResponse")
    public String setSampleObject(
        @WebParam(name = "obj", targetNamespace = "http://smartbear.com")
        SampleTestClass obj);

    /**
     * This method returns an object that is an XML node.
     * 
     * @return
     *     returns com.smartbear.GetXmlDataResponse.GetXmlDataResult
     */
    @WebMethod(operationName = "GetXmlData", action = "http://smartbear.com/GetXmlData")
    @WebResult(name = "GetXmlDataResult", targetNamespace = "http://smartbear.com")
    @RequestWrapper(localName = "GetXmlData", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetXmlData")
    @ResponseWrapper(localName = "GetXmlDataResponse", targetNamespace = "http://smartbear.com", className = "com.smartbear.GetXmlDataResponse")
    public com.smartbear.GetXmlDataResponse.GetXmlDataResult getXmlData();

}
