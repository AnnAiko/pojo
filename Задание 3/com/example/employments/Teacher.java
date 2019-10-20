//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.20 at 07:31:24 PM GMT+08:00 
//
package com.example.employments;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Teacher complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Teacher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countPairTime" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teacher", propOrder = {
    "fio",
    "countPairTime"
})
public class Teacher {

    @XmlElement(required = true)
    protected String fio;
    @XmlElement(required = true)
    protected int countPairTime;

    //Необходим для маршаллизации/демаршалиизации XML
    public Teacher() {
    }

    public Teacher(String fio, int countPairTime) {
        this.fio = fio;
        this.countPairTime = countPairTime;
    }

    /**
     * Gets the value of the fio property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFio(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the countPairTime property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public int getCountPairTime() {
        return countPairTime;
    }

    /**
     * Sets the value of the countPairTime property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setCountPairTime(int value) {
        this.countPairTime = value;
    }

    @Override
    public String toString() {
        return "\n\tФИО преподавателя: " + fio
                + "\n\tКол-во пар на недели по предмету: " + countPairTime + "\n";
    }

}
