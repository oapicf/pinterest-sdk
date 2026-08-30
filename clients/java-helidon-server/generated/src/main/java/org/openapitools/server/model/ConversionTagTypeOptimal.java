package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Conversion tag type
 */

public enum ConversionTagTypeOptimal {

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
    EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT"),
    ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
    ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
    INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
    SUBSCRIBE("SUBSCRIBE"),
    VIEW_CONTENT("VIEW_CONTENT"),
    ADVERTISER_DEFINED_EVENT("ADVERTISER_DEFINED_EVENT"),
    APP_OPEN("APP_OPEN"),
    CONTACT("CONTACT"),
    SCHEDULE("SCHEDULE"),
    FIND_LOCATION("FIND_LOCATION"),
    CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
    SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
    START_TRIAL("START_TRIAL");

    private String value;

    ConversionTagTypeOptimal(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ConversionTagTypeOptimal fromValue(String text) {
        for (ConversionTagTypeOptimal b : ConversionTagTypeOptimal.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

