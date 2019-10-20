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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Employment complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Employment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countStudent" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="subject" type="{http://www.example.com/employments}Subject"/>
 *         &lt;element name="teacher" type="{http://www.example.com/employments}Teacher"/>
 *       &lt;/sequence>
 *       &lt;attribute name="group" default="PI-1-16">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="PI-1-16"/>
 *             &lt;enumeration value="ISP-1-17"/>
 *             &lt;enumeration value="TPS-1-18"/>
 *             &lt;enumeration value="IS-1-15"/>
 *             &lt;enumeration value="BI-1-18"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employment", propOrder = {
    "countStudent",
    "subject",
    "teacher"
})
public class Employment {

    @XmlElement(required = true)
    protected int countStudent;
    @XmlElement(required = true)
    protected Subject subject;
    @XmlElement(required = true)
    protected Teacher teacher;
    @XmlAttribute(name = "group")
    protected String group;

    //Необходим для маршаллизации/демаршалиизации XML
    public Employment() {
    }

    public Employment(String group, int countStudent, Subject subject, Teacher teaсher) {
        this.group = group;
        this.countStudent = countStudent;
        this.subject = subject;
        this.teacher = teaсher;
    }

    /**
     * Gets the value of the countStudent property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public int getCountStudent() {
        return countStudent;
    }

    /**
     * Sets the value of the countStudent property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setCountStudent(int value) {
        this.countStudent = value;
    }

    /**
     * Gets the value of the subject property.
     *
     * @return possible object is {@link Subject }
     *
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value allowed object is {@link Subject }
     *
     */
    public void setSubject(Subject value) {
        this.subject = value;
    }

    /**
     * Gets the value of the teacher property.
     *
     * @return possible object is {@link Teacher }
     *
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * Sets the value of the teacher property.
     *
     * @param value allowed object is {@link Teacher }
     *
     */
    public void setTeacher(Teacher value) {
        this.teacher = value;
    }

    /**
     * Gets the value of the group property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGroup() {
        if (group == null) {
            return "PI-1-16";
        } else {
            return group;
        }
    }

    /**
     * Sets the value of the group property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGroup(String value) {
        this.group = value;
    }

    @Override
    public String toString() {
        return "\nГруппа: " + group + "\nКол-во студентов: " + countStudent
                + subject.toString() + teacher.toString();
    }

}
