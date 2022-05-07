package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Summary status for pin promotions
 **/

public enum PinPromotionSummaryStatus {

    APPROVED(String.valueOf("APPROVED")), PAUSED(String.valueOf("PAUSED")), PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), ADVERTISER_DISABLED(String.valueOf("ADVERTISER_DISABLED")), ARCHIVED(String.valueOf("ARCHIVED"));


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



