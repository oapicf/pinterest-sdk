package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Bulk file output format
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BulkOutputFormat {

    @JsonProperty("CSV") CSV(String.valueOf("CSV")), @JsonProperty("JSON") JSON(String.valueOf("JSON"));


    private String value;

    BulkOutputFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BulkOutputFormat fromValue(String value) {
        for (BulkOutputFormat b : BulkOutputFormat.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



