package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PlacementTrafficType {

    @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("TWO_COLUMN_FEED") TWO_COLUMN_FEED(String.valueOf("TWO_COLUMN_FEED")), @JsonProperty("FULLSCREEN_FEED") FULLSCREEN_FEED(String.valueOf("FULLSCREEN_FEED"));


    private String value;

    PlacementTrafficType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PlacementTrafficType fromValue(String value) {
        for (PlacementTrafficType b : PlacementTrafficType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



