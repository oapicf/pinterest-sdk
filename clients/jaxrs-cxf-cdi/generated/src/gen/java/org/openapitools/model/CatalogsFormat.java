package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * The file format of a feed.
 **/

public enum CatalogsFormat {

    TSV(String.valueOf("TSV")), CSV(String.valueOf("CSV")), XML(String.valueOf("XML"));


    private String value;

    CatalogsFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsFormat fromValue(String value) {
        for (CatalogsFormat b : CatalogsFormat.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



