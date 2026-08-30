package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The source of conversion events ingestion
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CreationSource {

    @JsonProperty("ADS_API") ADS_API(String.valueOf("ADS_API")), @JsonProperty("ADS_MANAGER_REPORTING_PAGE") ADS_MANAGER_REPORTING_PAGE(String.valueOf("ADS_MANAGER_REPORTING_PAGE")), @JsonProperty("ADS_MANAGER_REPORT_BUILDER") ADS_MANAGER_REPORT_BUILDER(String.valueOf("ADS_MANAGER_REPORT_BUILDER"));


    private String value;

    CreationSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CreationSource fromValue(String value) {
        for (CreationSource b : CreationSource.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



