package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The file format of a feed.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsFormat {

    @JsonProperty("TSV") TSV(String.valueOf("TSV")), @JsonProperty("CSV") CSV(String.valueOf("CSV")), @JsonProperty("XML") XML(String.valueOf("XML"));


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



