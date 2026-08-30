package org.openapitools.model;

import groovy.transform.Canonical

enum QuerymetrictypesItems {

    ENGAGEMENT("ENGAGEMENT"),
    
    ENGAGEMENT_RATE("ENGAGEMENT_RATE"),
    
    IMPRESSION("IMPRESSION"),
    
    OUTBOUND_CLICK("OUTBOUND_CLICK"),
    
    OUTBOUND_CLICK_RATE("OUTBOUND_CLICK_RATE"),
    
    PIN_CLICK("PIN_CLICK"),
    
    PIN_CLICK_RATE("PIN_CLICK_RATE"),
    
    SAVE("SAVE"),
    
    SAVE_RATE("SAVE_RATE")

    private final String value

    QuerymetrictypesItems(String value) {
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
