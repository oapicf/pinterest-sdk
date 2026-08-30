package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdvertiserDefinedEventMappingType {

    SIGNUP("SIGNUP"),
    
    ADD_TO_CART("ADD_TO_CART"),
    
    LEAD("LEAD"),
    
    CHECKOUT("CHECKOUT"),
    
    SUBSCRIBE("SUBSCRIBE"),
    
    ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
    
    ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
    
    INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
    
    CONTACT("CONTACT"),
    
    CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
    
    FIND_LOCATION("FIND_LOCATION"),
    
    SCHEDULE("SCHEDULE"),
    
    SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
    
    START_TRIAL("START_TRIAL"),
    
    PAGE_VISIT("PAGE_VISIT"),
    
    VIEW_CATEGORY("VIEW_CATEGORY"),
    
    VIEW_CONTENT("VIEW_CONTENT"),
    
    SEARCH("SEARCH"),
    
    WATCH_VIDEO("WATCH_VIDEO")

    private final String value

    AdvertiserDefinedEventMappingType(String value) {
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
