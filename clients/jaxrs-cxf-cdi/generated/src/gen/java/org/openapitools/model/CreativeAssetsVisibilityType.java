package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Creative assets visibility.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CreativeAssetsVisibilityType {

    @JsonProperty("VISIBLE") VISIBLE(String.valueOf("VISIBLE")), @JsonProperty("HIDDEN") HIDDEN(String.valueOf("HIDDEN"));


    private String value;

    CreativeAssetsVisibilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CreativeAssetsVisibilityType fromValue(String value) {
        for (CreativeAssetsVisibilityType b : CreativeAssetsVisibilityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



