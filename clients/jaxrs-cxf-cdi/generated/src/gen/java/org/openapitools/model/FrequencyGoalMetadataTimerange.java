package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum FrequencyGoalMetadataTimerange {

    @JsonProperty("THIRTY_DAY") THIRTY_DAY(String.valueOf("THIRTY_DAY")), @JsonProperty("DAY") DAY(String.valueOf("DAY")), @JsonProperty("SEVEN_DAY") SEVEN_DAY(String.valueOf("SEVEN_DAY")), @JsonProperty("TWENTY_MINUTE") TWENTY_MINUTE(String.valueOf("TWENTY_MINUTE")), @JsonProperty("TEN_MINUTE") TEN_MINUTE(String.valueOf("TEN_MINUTE")), @JsonProperty("TWENTY_FOUR_HOUR") TWENTY_FOUR_HOUR(String.valueOf("TWENTY_FOUR_HOUR"));


    private String value;

    FrequencyGoalMetadataTimerange(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FrequencyGoalMetadataTimerange fromValue(String value) {
        for (FrequencyGoalMetadataTimerange b : FrequencyGoalMetadataTimerange.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



