package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Campaign placement group type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PlacementGroupType {

    @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("BROWSE") BROWSE(String.valueOf("BROWSE")), @JsonProperty("OTHER") OTHER(String.valueOf("OTHER"));


    private String value;

    PlacementGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PlacementGroupType fromValue(String value) {
        for (PlacementGroupType b : PlacementGroupType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



