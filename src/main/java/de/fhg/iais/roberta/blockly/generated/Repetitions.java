//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.10 at 10:35:23 nachm. MESZ 
//


package de.fhg.iais.roberta.blockly.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repetitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repetitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="value" type="{http://de.fhg.iais.roberta.blockly}value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statement" type="{http://de.fhg.iais.roberta.blockly}statement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repetitions", propOrder = {
    "valueAndStatement"
})
public class Repetitions {

    @XmlElements({
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "value", type = Value.class)
    })
    protected List<Object> valueAndStatement;

    /**
     * Gets the value of the valueAndStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueAndStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueAndStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statement }
     * {@link Value }
     * 
     * 
     */
    public List<Object> getValueAndStatement() {
        if (valueAndStatement == null) {
            valueAndStatement = new ArrayList<Object>();
        }
        return this.valueAndStatement;
    }

}
