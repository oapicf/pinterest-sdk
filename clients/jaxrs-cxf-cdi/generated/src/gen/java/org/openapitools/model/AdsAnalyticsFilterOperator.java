package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Filter operator for sync reporting
 **/

public enum AdsAnalyticsFilterOperator {

    LESS_THAN(String.valueOf("LESS_THAN")), GREATER_THAN(String.valueOf("GREATER_THAN"));


    private String value;

    AdsAnalyticsFilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdsAnalyticsFilterOperator fromValue(String value) {
        for (AdsAnalyticsFilterOperator b : AdsAnalyticsFilterOperator.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



