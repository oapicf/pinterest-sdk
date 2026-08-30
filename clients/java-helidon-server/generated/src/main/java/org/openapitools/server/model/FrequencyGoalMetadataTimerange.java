package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets FrequencyGoalMetadataTimerange
 */

public enum FrequencyGoalMetadataTimerange {

    THIRTY_DAY("THIRTY_DAY"),
    DAY("DAY"),
    SEVEN_DAY("SEVEN_DAY"),
    TWENTY_MINUTE("TWENTY_MINUTE"),
    TEN_MINUTE("TEN_MINUTE"),
    TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

    private String value;

    FrequencyGoalMetadataTimerange(String value) {
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
    public static FrequencyGoalMetadataTimerange fromValue(String text) {
        for (FrequencyGoalMetadataTimerange b : FrequencyGoalMetadataTimerange.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

