package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 **/

public enum CatalogsStatus {

    ACTIVE(String.valueOf("ACTIVE")), INACTIVE(String.valueOf("INACTIVE"));


    private String value;

    CatalogsStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsStatus fromValue(String value) {
        for (CatalogsStatus b : CatalogsStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



