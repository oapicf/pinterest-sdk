package org.openapitools.model;

import groovy.transform.Canonical

enum ConversionEvent {

    PAGE_VISIT("PAGE_VISIT"),
    
    SIGNUP("SIGNUP"),
    
    CHECKOUT("CHECKOUT"),
    
    CUSTOM("CUSTOM"),
    
    VIEW_CATEGORY("VIEW_CATEGORY"),
    
    SEARCH("SEARCH"),
    
    ADD_TO_CART("ADD_TO_CART"),
    
    WATCH_VIDEO("WATCH_VIDEO"),
    
    LEAD("LEAD"),
    
    APP_INSTALL("APP_INSTALL")

    private final String value

    ConversionEvent(String value) {
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
