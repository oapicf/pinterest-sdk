package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Summary status for product group
 */

public enum ProductGroupSummaryStatus {

    RUNNING("RUNNING"),
    PAUSED("PAUSED"),
    EXCLUDED("EXCLUDED"),
    ARCHIVED("ARCHIVED");

    private String value;

    ProductGroupSummaryStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ProductGroupSummaryStatus fromValue(String text) {
        for (ProductGroupSummaryStatus b : ProductGroupSummaryStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

