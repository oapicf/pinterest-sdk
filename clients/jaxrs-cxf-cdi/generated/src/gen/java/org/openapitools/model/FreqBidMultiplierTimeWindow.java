package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The time window for frequency bid multipliers.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FreqBidMultiplierTimeWindow {

    @JsonProperty("WEEK") WEEK(String.valueOf("WEEK")), @JsonProperty("MONTH") MONTH(String.valueOf("MONTH"));


    private String value;

    FreqBidMultiplierTimeWindow(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FreqBidMultiplierTimeWindow fromValue(String value) {
        for (FreqBidMultiplierTimeWindow b : FreqBidMultiplierTimeWindow.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



