package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Conversion attribution window in days.
 */

public enum CampaignPlanningConversionAttributionWindowDays {

    DAYS_0("DAYS_0"),
    DAYS_1("DAYS_1"),
    DAYS_7("DAYS_7"),
    DAYS_30("DAYS_30"),
    DAYS_60("DAYS_60");

    private String value;

    CampaignPlanningConversionAttributionWindowDays(String value) {
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
    public static CampaignPlanningConversionAttributionWindowDays fromValue(String text) {
        for (CampaignPlanningConversionAttributionWindowDays b : CampaignPlanningConversionAttributionWindowDays.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

