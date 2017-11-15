
package com.smartbear;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetArrayResult" type="{http://smartbear.com}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getArrayResult"
})
@XmlRootElement(name = "GetArrayResponse")
public class GetArrayResponse {

    @XmlElement(name = "GetArrayResult")
    protected ArrayOfInt getArrayResult;

    /**
     * Gets the value of the getArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getGetArrayResult() {
        return getArrayResult;
    }

    /**
     * Sets the value of the getArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setGetArrayResult(ArrayOfInt value) {
        this.getArrayResult = value;
    }

}
