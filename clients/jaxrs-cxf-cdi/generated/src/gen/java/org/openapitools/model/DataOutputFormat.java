package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Format of generated report
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DataOutputFormat {

    @JsonProperty("JSON") JSON(String.valueOf("JSON")), @JsonProperty("CSV") CSV(String.valueOf("CSV"));


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



