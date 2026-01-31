package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * List of ingestion sources for a conversion event.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum IngestionSourceOptions {

    @JsonProperty("TAG") TAG(String.valueOf("TAG")), @JsonProperty("MMP") MMP(String.valueOf("MMP")), @JsonProperty("FILE_UPLOAD") FILE_UPLOAD(String.valueOf("FILE_UPLOAD")), @JsonProperty("CONVERSIONS_API") CONVERSIONS_API(String.valueOf("CONVERSIONS_API")), @JsonProperty("NATIVE") NATIVE(String.valueOf("NATIVE"));


    private String value;

    IngestionSourceOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IngestionSourceOptions fromValue(String value) {
        for (IngestionSourceOptions b : IngestionSourceOptions.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



