package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Placement type for bid multiplier targeting.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PlacementType {

    @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("BROWSE") BROWSE(String.valueOf("BROWSE")), @JsonProperty("RELATED_PINS") RELATED_PINS(String.valueOf("RELATED_PINS"));


    private String value;

    PlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PlacementType fromValue(String value) {
        for (PlacementType b : PlacementType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



