package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The type of an SSIO order line.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum SSIOOrderLineType {

    @JsonProperty("BUDGET") BUDGET(String.valueOf("BUDGET")), @JsonProperty("PERPETUALS") PERPETUALS(String.valueOf("PERPETUALS"));


    private String value;

    SSIOOrderLineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SSIOOrderLineType fromValue(String value) {
        for (SSIOOrderLineType b : SSIOOrderLineType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



