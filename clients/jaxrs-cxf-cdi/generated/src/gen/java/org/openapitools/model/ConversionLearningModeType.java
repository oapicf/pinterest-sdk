package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * oCPM learn mode.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionLearningModeType {

    @JsonProperty("NOT_ACTIVE") NOT_ACTIVE(String.valueOf("NOT_ACTIVE")), @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE"));


    private String value;

    ConversionLearningModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionLearningModeType fromValue(String value) {
        for (ConversionLearningModeType b : ConversionLearningModeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



