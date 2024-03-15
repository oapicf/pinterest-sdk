package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Summary status for pin promotions
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PinPromotionSummaryStatus {

    @JsonProperty("APPROVED") APPROVED(String.valueOf("APPROVED")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("REJECTED") REJECTED(String.valueOf("REJECTED")), @JsonProperty("ADVERTISER_DISABLED") ADVERTISER_DISABLED(String.valueOf("ADVERTISER_DISABLED")), @JsonProperty("ARCHIVED") ARCHIVED(String.valueOf("ARCHIVED")), @JsonProperty("DRAFT") DRAFT(String.valueOf("DRAFT")), @JsonProperty("DELETED_DRAFT") DELETED_DRAFT(String.valueOf("DELETED_DRAFT"));


    private String value;

    PinPromotionSummaryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PinPromotionSummaryStatus fromValue(String value) {
        for (PinPromotionSummaryStatus b : PinPromotionSummaryStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



