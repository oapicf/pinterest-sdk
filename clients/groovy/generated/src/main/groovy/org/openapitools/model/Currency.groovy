package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum Currency {

    UNK("UNK"),
    
    USD("USD"),
    
    GBP("GBP"),
    
    CAD("CAD"),
    
    EUR("EUR"),
    
    AUD("AUD"),
    
    NZD("NZD"),
    
    SEK("SEK"),
    
    ILS("ILS"),
    
    CHF("CHF"),
    
    HKD("HKD"),
    
    JPY("JPY"),
    
    SGD("SGD"),
    
    KRW("KRW"),
    
    NOK("NOK"),
    
    DKK("DKK"),
    
    PLN("PLN"),
    
    RON("RON"),
    
    HUF("HUF"),
    
    CZK("CZK"),
    
    BRL("BRL"),
    
    MXN("MXN"),
    
    ARS("ARS"),
    
    CLP("CLP"),
    
    COP("COP")

    private final String value

    Currency(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
