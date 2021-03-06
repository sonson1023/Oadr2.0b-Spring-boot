//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the payload for reports that require a status.
 * 
 * <p>Java class for oadrPayloadResourceStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oadrPayloadResourceStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}PayloadBaseType">
 *       &lt;sequence>
 *         &lt;element name="oadrOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oadrManualOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrLoadControlState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrPayloadResourceStatusType", propOrder = {
    "oadrOnline",
    "oadrManualOverride",
    "oadrLoadControlState"
})
public class OadrPayloadResourceStatusType
    extends PayloadBaseType
{

    protected boolean oadrOnline;
    protected boolean oadrManualOverride;
    protected OadrLoadControlState oadrLoadControlState;

    /**
     * Gets the value of the oadrOnline property.
     * 
     */
    public boolean isOadrOnline() {
        return oadrOnline;
    }

    /**
     * Sets the value of the oadrOnline property.
     * 
     */
    public void setOadrOnline(boolean value) {
        this.oadrOnline = value;
    }

    /**
     * Gets the value of the oadrManualOverride property.
     * 
     */
    public boolean isOadrManualOverride() {
        return oadrManualOverride;
    }

    /**
     * Sets the value of the oadrManualOverride property.
     * 
     */
    public void setOadrManualOverride(boolean value) {
        this.oadrManualOverride = value;
    }

    /**
     * Gets the value of the oadrLoadControlState property.
     * 
     * @return
     *     possible object is
     *     {@link OadrLoadControlState }
     *     
     */
    public OadrLoadControlState getOadrLoadControlState() {
        return oadrLoadControlState;
    }

    /**
     * Sets the value of the oadrLoadControlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrLoadControlState }
     *     
     */
    public void setOadrLoadControlState(OadrLoadControlState value) {
        this.oadrLoadControlState = value;
    }

}
