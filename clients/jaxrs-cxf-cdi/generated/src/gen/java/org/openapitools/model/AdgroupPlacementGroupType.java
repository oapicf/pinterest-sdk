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

public enum AdgroupPlacementGroupType {

    @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("BROWSE") BROWSE(String.valueOf("BROWSE")), @JsonProperty("OTHER") OTHER(String.valueOf("OTHER"));


    private String value;

    AdgroupPlacementGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdgroupPlacementGroupType fromValue(String value) {
        for (AdgroupPlacementGroupType b : AdgroupPlacementGroupType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



