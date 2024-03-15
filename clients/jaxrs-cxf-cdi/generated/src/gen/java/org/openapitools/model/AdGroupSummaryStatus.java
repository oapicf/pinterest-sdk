package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Summary status for ad group
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdGroupSummaryStatus {

    @JsonProperty("RUNNING") RUNNING(String.valueOf("RUNNING")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("NOT_STARTED") NOT_STARTED(String.valueOf("NOT_STARTED")), @JsonProperty("COMPLETED") COMPLETED(String.valueOf("COMPLETED")), @JsonProperty("ADVERTISER_DISABLED") ADVERTISER_DISABLED(String.valueOf("ADVERTISER_DISABLED")), @JsonProperty("ARCHIVED") ARCHIVED(String.valueOf("ARCHIVED")), @JsonProperty("DRAFT") DRAFT(String.valueOf("DRAFT")), @JsonProperty("DELETED_DRAFT") DELETED_DRAFT(String.valueOf("DELETED_DRAFT"));


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



