package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Summary status for ad group
 **/

public enum AdGroupSummaryStatus {

    RUNNING(String.valueOf("RUNNING")), PAUSED(String.valueOf("PAUSED")), NOT_STARTED(String.valueOf("NOT_STARTED")), COMPLETED(String.valueOf("COMPLETED")), ADVERTISER_DISABLED(String.valueOf("ADVERTISER_DISABLED")), ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    AdGroupSummaryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdGroupSummaryStatus fromValue(String value) {
        for (AdGroupSummaryStatus b : AdGroupSummaryStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



