package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Status of a leads export job
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LeadsExportStatus {

    @JsonProperty("IN_PROGRESS") IN_PROGRESS(String.valueOf("IN_PROGRESS")), @JsonProperty("FINISHED") FINISHED(String.valueOf("FINISHED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    LeadsExportStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LeadsExportStatus fromValue(String value) {
        for (LeadsExportStatus b : LeadsExportStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



