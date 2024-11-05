package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The enhanced match status of the tag
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum EnhancedMatchStatusType {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("NOT_VALIDATED") NOT_VALIDATED(String.valueOf("NOT_VALIDATED")), @JsonProperty("VALIDATING_IN_PROGRESS") VALIDATING_IN_PROGRESS(String.valueOf("VALIDATING_IN_PROGRESS")), @JsonProperty("VALIDATION_COMPLETE") VALIDATION_COMPLETE(String.valueOf("VALIDATION_COMPLETE"));


    private String value;

    EnhancedMatchStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EnhancedMatchStatusType fromValue(String value) {
        for (EnhancedMatchStatusType b : EnhancedMatchStatusType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



