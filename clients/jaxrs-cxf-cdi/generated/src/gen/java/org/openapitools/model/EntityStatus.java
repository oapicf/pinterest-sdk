package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Entity status
 **/

public enum EntityStatus {

    ACTIVE(String.valueOf("ACTIVE")), PAUSED(String.valueOf("PAUSED")), ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    EntityStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EntityStatus fromValue(String value) {
        for (EntityStatus b : EntityStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



