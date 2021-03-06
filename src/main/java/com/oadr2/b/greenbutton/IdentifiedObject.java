//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b.greenbutton;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a root class to provide common naming attributes for all classes needing naming attributes
 * 
 * <p>Java class for IdentifiedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="batchItemInfo" type="{http://naesb.org/espi}BatchItemInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedObject", propOrder = {
    "batchItemInfo"
})
@XmlSeeAlso({
    ReadingType.class,
    IntervalBlock.class,
    ElectricPowerQualitySummary.class,
    LocalTimeParameters.class,
    ElectricPowerUsageSummary.class,
    UsagePoint.class,
    MeterReading.class
})
public class IdentifiedObject
    extends Object
{

    protected BatchItemInfo batchItemInfo;

    /**
     * Gets the value of the batchItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BatchItemInfo }
     *     
     */
    public BatchItemInfo getBatchItemInfo() {
        return batchItemInfo;
    }

    /**
     * Sets the value of the batchItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchItemInfo }
     *     
     */
    public void setBatchItemInfo(BatchItemInfo value) {
        this.batchItemInfo = value;
    }

}
