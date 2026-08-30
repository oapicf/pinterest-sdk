package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OptimizationType {

    @JsonProperty("CLICKTHROUGH") CLICKTHROUGH(String.valueOf("CLICKTHROUGH")), @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("WEB_CONVERSION") WEB_CONVERSION(String.valueOf("WEB_CONVERSION")), @JsonProperty("ROAS") ROAS(String.valueOf("ROAS")), @JsonProperty("OUTBOUND_CLICK") OUTBOUND_CLICK(String.valueOf("OUTBOUND_CLICK"));


    private String value;

    OptimizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OptimizationType fromValue(String value) {
        for (OptimizationType b : OptimizationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



