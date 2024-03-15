package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ConversionTagType {

    PAGE_LOAD("PAGE_LOAD"),
    
    UNKNOWN("UNKNOWN"),
    
    INITIALIZED("INITIALIZED"),
    
    PAGE_VISIT("PAGE_VISIT"),
    
    SIGNUP("SIGNUP"),
    
    CHECKOUT("CHECKOUT"),
    
    CUSTOM("CUSTOM"),
    
    VIEW_CATEGORY("VIEW_CATEGORY"),
    
    SEARCH("SEARCH"),
    
    ADD_TO_CART("ADD_TO_CART"),
    
    WATCH_VIDEO("WATCH_VIDEO"),
    
    LEAD("LEAD"),
    
    APP_INSTALL("APP_INSTALL"),
    
    WEB_SESSION("WEB_SESSION"),
    
    EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT")

    private final String value

    ConversionTagType(String value) {
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
