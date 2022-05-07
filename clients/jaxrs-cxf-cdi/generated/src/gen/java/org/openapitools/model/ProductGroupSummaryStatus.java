package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Summary status for product group
 **/

public enum ProductGroupSummaryStatus {

    RUNNING(String.valueOf("RUNNING")), PAUSED(String.valueOf("PAUSED")), EXCLUDED(String.valueOf("EXCLUDED")), ARCHIVED(String.valueOf("ARCHIVED"));


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



