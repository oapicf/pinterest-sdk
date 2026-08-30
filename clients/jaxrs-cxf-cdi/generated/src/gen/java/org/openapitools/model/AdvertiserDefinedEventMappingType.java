package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdvertiserDefinedEventMappingType {

    @JsonProperty("SIGNUP") SIGNUP(String.valueOf("SIGNUP")), @JsonProperty("ADD_TO_CART") ADD_TO_CART(String.valueOf("ADD_TO_CART")), @JsonProperty("LEAD") LEAD(String.valueOf("LEAD")), @JsonProperty("CHECKOUT") CHECKOUT(String.valueOf("CHECKOUT")), @JsonProperty("SUBSCRIBE") SUBSCRIBE(String.valueOf("SUBSCRIBE")), @JsonProperty("ADD_TO_WISHLIST") ADD_TO_WISHLIST(String.valueOf("ADD_TO_WISHLIST")), @JsonProperty("ADD_PAYMENT_INFO") ADD_PAYMENT_INFO(String.valueOf("ADD_PAYMENT_INFO")), @JsonProperty("INITIATE_CHECKOUT") INITIATE_CHECKOUT(String.valueOf("INITIATE_CHECKOUT")), @JsonProperty("CONTACT") CONTACT(String.valueOf("CONTACT")), @JsonProperty("CUSTOMIZE_PRODUCT") CUSTOMIZE_PRODUCT(String.valueOf("CUSTOMIZE_PRODUCT")), @JsonProperty("FIND_LOCATION") FIND_LOCATION(String.valueOf("FIND_LOCATION")), @JsonProperty("SCHEDULE") SCHEDULE(String.valueOf("SCHEDULE")), @JsonProperty("SUBMIT_APPLICATION") SUBMIT_APPLICATION(String.valueOf("SUBMIT_APPLICATION")), @JsonProperty("START_TRIAL") START_TRIAL(String.valueOf("START_TRIAL")), @JsonProperty("PAGE_VISIT") PAGE_VISIT(String.valueOf("PAGE_VISIT")), @JsonProperty("VIEW_CATEGORY") VIEW_CATEGORY(String.valueOf("VIEW_CATEGORY")), @JsonProperty("VIEW_CONTENT") VIEW_CONTENT(String.valueOf("VIEW_CONTENT")), @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("WATCH_VIDEO") WATCH_VIDEO(String.valueOf("WATCH_VIDEO"));


    private String value;

    AdvertiserDefinedEventMappingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdvertiserDefinedEventMappingType fromValue(String value) {
        for (AdvertiserDefinedEventMappingType b : AdvertiserDefinedEventMappingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



