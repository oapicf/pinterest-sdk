package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Public ad targeting type with external names
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PublicTargetingType {

    @JsonProperty("APPTYPE") APPTYPE(String.valueOf("APPTYPE")), @JsonProperty("GENDER") GENDER(String.valueOf("GENDER")), @JsonProperty("LOCALE") LOCALE(String.valueOf("LOCALE")), @JsonProperty("AGE_BUCKET") AGE_BUCKET(String.valueOf("AGE_BUCKET")), @JsonProperty("LOCATION") LOCATION(String.valueOf("LOCATION")), @JsonProperty("GEO") GEO(String.valueOf("GEO")), @JsonProperty("INTEREST") INTEREST(String.valueOf("INTEREST")), @JsonProperty("KEYWORD") KEYWORD(String.valueOf("KEYWORD")), @JsonProperty("AUDIENCE_INCLUDE") AUDIENCE_INCLUDE(String.valueOf("AUDIENCE_INCLUDE")), @JsonProperty("AUDIENCE_EXCLUDE") AUDIENCE_EXCLUDE(String.valueOf("AUDIENCE_EXCLUDE"));


    private String value;

    PublicTargetingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PublicTargetingType fromValue(String value) {
        for (PublicTargetingType b : PublicTargetingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



