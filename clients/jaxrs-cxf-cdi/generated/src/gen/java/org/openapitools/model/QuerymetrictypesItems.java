package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum QuerymetrictypesItems {

    @JsonProperty("ENGAGEMENT") ENGAGEMENT(String.valueOf("ENGAGEMENT")), @JsonProperty("ENGAGEMENT_RATE") ENGAGEMENT_RATE(String.valueOf("ENGAGEMENT_RATE")), @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("OUTBOUND_CLICK") OUTBOUND_CLICK(String.valueOf("OUTBOUND_CLICK")), @JsonProperty("OUTBOUND_CLICK_RATE") OUTBOUND_CLICK_RATE(String.valueOf("OUTBOUND_CLICK_RATE")), @JsonProperty("PIN_CLICK") PIN_CLICK(String.valueOf("PIN_CLICK")), @JsonProperty("PIN_CLICK_RATE") PIN_CLICK_RATE(String.valueOf("PIN_CLICK_RATE")), @JsonProperty("SAVE") SAVE(String.valueOf("SAVE")), @JsonProperty("SAVE_RATE") SAVE_RATE(String.valueOf("SAVE_RATE"));


    private String value;

    QuerymetrictypesItems(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QuerymetrictypesItems fromValue(String value) {
        for (QuerymetrictypesItems b : QuerymetrictypesItems.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



