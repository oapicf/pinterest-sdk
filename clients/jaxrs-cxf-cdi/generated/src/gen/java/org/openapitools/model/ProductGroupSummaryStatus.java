package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Summary status for product group
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ProductGroupSummaryStatus {

    @JsonProperty("RUNNING") RUNNING(String.valueOf("RUNNING")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("EXCLUDED") EXCLUDED(String.valueOf("EXCLUDED")), @JsonProperty("ARCHIVED") ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    ProductGroupSummaryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductGroupSummaryStatus fromValue(String value) {
        for (ProductGroupSummaryStatus b : ProductGroupSummaryStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



