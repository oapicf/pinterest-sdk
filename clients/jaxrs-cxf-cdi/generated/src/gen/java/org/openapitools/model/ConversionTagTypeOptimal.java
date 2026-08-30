package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion tag type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionTagTypeOptimal {

    @JsonProperty("PAGE_LOAD") PAGE_LOAD(String.valueOf("PAGE_LOAD")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("INITIALIZED") INITIALIZED(String.valueOf("INITIALIZED")), @JsonProperty("PAGE_VISIT") PAGE_VISIT(String.valueOf("PAGE_VISIT")), @JsonProperty("SIGNUP") SIGNUP(String.valueOf("SIGNUP")), @JsonProperty("CHECKOUT") CHECKOUT(String.valueOf("CHECKOUT")), @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM")), @JsonProperty("VIEW_CATEGORY") VIEW_CATEGORY(String.valueOf("VIEW_CATEGORY")), @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("ADD_TO_CART") ADD_TO_CART(String.valueOf("ADD_TO_CART")), @JsonProperty("WATCH_VIDEO") WATCH_VIDEO(String.valueOf("WATCH_VIDEO")), @JsonProperty("LEAD") LEAD(String.valueOf("LEAD")), @JsonProperty("APP_INSTALL") APP_INSTALL(String.valueOf("APP_INSTALL")), @JsonProperty("WEB_SESSION") WEB_SESSION(String.valueOf("WEB_SESSION")), @JsonProperty("EXTERNAL_MEASUREMENT") EXTERNAL_MEASUREMENT(String.valueOf("EXTERNAL_MEASUREMENT")), @JsonProperty("ADD_PAYMENT_INFO") ADD_PAYMENT_INFO(String.valueOf("ADD_PAYMENT_INFO")), @JsonProperty("ADD_TO_WISHLIST") ADD_TO_WISHLIST(String.valueOf("ADD_TO_WISHLIST")), @JsonProperty("INITIATE_CHECKOUT") INITIATE_CHECKOUT(String.valueOf("INITIATE_CHECKOUT")), @JsonProperty("SUBSCRIBE") SUBSCRIBE(String.valueOf("SUBSCRIBE")), @JsonProperty("VIEW_CONTENT") VIEW_CONTENT(String.valueOf("VIEW_CONTENT")), @JsonProperty("ADVERTISER_DEFINED_EVENT") ADVERTISER_DEFINED_EVENT(String.valueOf("ADVERTISER_DEFINED_EVENT")), @JsonProperty("APP_OPEN") APP_OPEN(String.valueOf("APP_OPEN")), @JsonProperty("CONTACT") CONTACT(String.valueOf("CONTACT")), @JsonProperty("SCHEDULE") SCHEDULE(String.valueOf("SCHEDULE")), @JsonProperty("FIND_LOCATION") FIND_LOCATION(String.valueOf("FIND_LOCATION")), @JsonProperty("CUSTOMIZE_PRODUCT") CUSTOMIZE_PRODUCT(String.valueOf("CUSTOMIZE_PRODUCT")), @JsonProperty("SUBMIT_APPLICATION") SUBMIT_APPLICATION(String.valueOf("SUBMIT_APPLICATION")), @JsonProperty("START_TRIAL") START_TRIAL(String.valueOf("START_TRIAL"));


    private String value;

    ConversionTagTypeOptimal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionTagTypeOptimal fromValue(String value) {
        for (ConversionTagTypeOptimal b : ConversionTagTypeOptimal.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



