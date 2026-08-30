package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionAttributionWindowDays {

    @JsonProperty("new BigDecimal("0")") NUMBER_0(BigDecimal.valueOf(new BigDecimal("0"))), @JsonProperty("new BigDecimal("1")") NUMBER_1(BigDecimal.valueOf(new BigDecimal("1"))), @JsonProperty("new BigDecimal("7")") NUMBER_7(BigDecimal.valueOf(new BigDecimal("7"))), @JsonProperty("new BigDecimal("14")") NUMBER_14(BigDecimal.valueOf(new BigDecimal("14"))), @JsonProperty("new BigDecimal("30")") NUMBER_30(BigDecimal.valueOf(new BigDecimal("30"))), @JsonProperty("new BigDecimal("60")") NUMBER_60(BigDecimal.valueOf(new BigDecimal("60")));


    private BigDecimal value;

    ConversionAttributionWindowDays(BigDecimal v) {
        value = v;
    }

    public BigDecimal value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionAttributionWindowDays fromValue(BigDecimal value) {
        for (ConversionAttributionWindowDays b : ConversionAttributionWindowDays.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



