package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to &#x60;DIRECT_TO_DESTINATION&#x60; by default for direct links supported ads. &#x60;grid_click_type&#x60; values provided will be ignored.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum GridClickType {

    @JsonProperty("CLOSEUP") CLOSEUP(String.valueOf("CLOSEUP")), @JsonProperty("DIRECT_TO_DESTINATION") DIRECT_TO_DESTINATION(String.valueOf("DIRECT_TO_DESTINATION"));


    private String value;

    GridClickType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GridClickType fromValue(String value) {
        for (GridClickType b : GridClickType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



