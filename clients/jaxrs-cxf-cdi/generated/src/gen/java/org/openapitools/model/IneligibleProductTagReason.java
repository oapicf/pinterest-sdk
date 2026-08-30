package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Reason why a product pin is ineligible for tagging.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum IneligibleProductTagReason {

    @JsonProperty("PIN_MISSING") PIN_MISSING(String.valueOf("PIN_MISSING")), @JsonProperty("PIN_IS_PRIVATE") PIN_IS_PRIVATE(String.valueOf("PIN_IS_PRIVATE")), @JsonProperty("PRODUCT_METADATA_MISSING") PRODUCT_METADATA_MISSING(String.valueOf("PRODUCT_METADATA_MISSING")), @JsonProperty("PIN_NOT_FROM_VERIFIED_DOMAIN") PIN_NOT_FROM_VERIFIED_DOMAIN(String.valueOf("PIN_NOT_FROM_VERIFIED_DOMAIN")), @JsonProperty("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN") PIN_NOT_FROM_SAME_USER_AS_HERO_PIN(String.valueOf("PIN_NOT_FROM_SAME_USER_AS_HERO_PIN"));


    private String value;

    IneligibleProductTagReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IneligibleProductTagReason fromValue(String value) {
        for (IneligibleProductTagReason b : IneligibleProductTagReason.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



