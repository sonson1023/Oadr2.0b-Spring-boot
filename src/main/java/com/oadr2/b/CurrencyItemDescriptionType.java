//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.07 at 12:32:33 PM CDT 
//


package com.oadr2.b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyItemDescriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currencyItemDescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="currency"/>
 *     &lt;enumeration value="currencyPerKW"/>
 *     &lt;enumeration value="currencyPerKWh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currencyItemDescriptionType")
@XmlEnum
public enum CurrencyItemDescriptionType {

    @XmlEnumValue("currency")
    CURRENCY("currency"),
    @XmlEnumValue("currencyPerKW")
    CURRENCY_PER_KW("currencyPerKW"),
    @XmlEnumValue("currencyPerKWh")
    CURRENCY_PER_K_WH("currencyPerKWh");
    private final String value;

    CurrencyItemDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyItemDescriptionType fromValue(String v) {
        for (CurrencyItemDescriptionType c: CurrencyItemDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
