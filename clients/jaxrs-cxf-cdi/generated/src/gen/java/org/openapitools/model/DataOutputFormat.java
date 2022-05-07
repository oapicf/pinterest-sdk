package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Format of generated report
 **/

public enum DataOutputFormat {

    JSON(String.valueOf("JSON")), CSV(String.valueOf("CSV"));


    private String value;

    DataOutputFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DataOutputFormat fromValue(String value) {
        for (DataOutputFormat b : DataOutputFormat.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



