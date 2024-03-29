//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.20 at 07:31:24 PM GMT+08:00 
//
package com.example.employments;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Subject complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Subject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameSub">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Math"/>
 *               &lt;enumeration value="Literature"/>
 *               &lt;enumeration value="Physics"/>
 *               &lt;enumeration value="History"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="time">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Monday"/>
 *               &lt;enumeration value="Tuesday"/>
 *               &lt;enumeration value="Wednesday"/>
 *               &lt;enumeration value="Thursday"/>
 *               &lt;enumeration value="Friday"/>
 *               &lt;enumeration value="Saturday"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="audience" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subject", propOrder = {
    "nameSub",
    "time",
    "audience"
})
public class Subject {

    @XmlElement(required = true)
    protected String nameSub;
    @XmlElement(required = true)
    protected String time;
    @XmlElement(required = true)
    protected String audience;

    //Необходим для маршаллизации/демаршалиизации XML
    public Subject() {
    }

    public Subject(String nameSub, String time, String audience) {
        this.nameSub = nameSub;
        this.time = time;
        this.audience = audience;
    }

    /**
     * Gets the value of the nameSub property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNameSub() {
        return nameSub;
    }

    /**
     * Sets the value of the nameSub property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNameSub(String value) {
        this.nameSub = value;
    }

    /**
     * Gets the value of the time property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the audience property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAudience(String value) {
        this.audience = value;
    }

    @Override
    public String toString() {
        return "\n\tНаименование предмета: " + nameSub
                + "\n\tДень недели: " + time + "\n\tАудитория: " + audience + "\n";
    }

}
