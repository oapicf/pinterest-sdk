package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Reporting columns for sync reporting data filter
 **/

public enum AdsAnalyticsFilterColumn {

    SPEND_IN_DOLLAR(String.valueOf("SPEND_IN_DOLLAR")), TOTAL_IMPRESSION(String.valueOf("TOTAL_IMPRESSION"));


    private String value;

    AdsAnalyticsFilterColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdsAnalyticsFilterColumn fromValue(String value) {
        for (AdsAnalyticsFilterColumn b : AdsAnalyticsFilterColumn.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



