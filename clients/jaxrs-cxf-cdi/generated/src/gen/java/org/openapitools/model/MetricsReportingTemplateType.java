package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Reporting template type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MetricsReportingTemplateType {

    @JsonProperty("UNSPECIFIED") UNSPECIFIED(String.valueOf("UNSPECIFIED")), @JsonProperty("BULK") BULK(String.valueOf("BULK")), @JsonProperty("OVERVIEW") OVERVIEW(String.valueOf("OVERVIEW")), @JsonProperty("TABLE") TABLE(String.valueOf("TABLE")), @JsonProperty("MMM") MMM(String.valueOf("MMM")), @JsonProperty("BRAND_CATEGORY") BRAND_CATEGORY(String.valueOf("BRAND_CATEGORY"));


    private String value;

    MetricsReportingTemplateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MetricsReportingTemplateType fromValue(String value) {
        for (MetricsReportingTemplateType b : MetricsReportingTemplateType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



