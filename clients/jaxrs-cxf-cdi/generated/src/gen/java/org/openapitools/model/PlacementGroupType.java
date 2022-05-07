package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Campaign placement group type
 **/

public enum PlacementGroupType {

    ALL(String.valueOf("ALL")), SEARCH(String.valueOf("SEARCH")), BROWSE(String.valueOf("BROWSE")), OTHER(String.valueOf("OTHER"));


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



