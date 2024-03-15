package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionAttributionWindowDays {

    @JsonProperty("0") NUMBER_0(Integer.valueOf(0)), @JsonProperty("1") NUMBER_1(Integer.valueOf(1)), @JsonProperty("7") NUMBER_7(Integer.valueOf(7)), @JsonProperty("14") NUMBER_14(Integer.valueOf(14)), @JsonProperty("30") NUMBER_30(Integer.valueOf(30)), @JsonProperty("60") NUMBER_60(Integer.valueOf(60));


    private Integer value;

    ConversionAttributionWindowDays(Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionAttributionWindowDays fromValue(Integer value) {
        for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



