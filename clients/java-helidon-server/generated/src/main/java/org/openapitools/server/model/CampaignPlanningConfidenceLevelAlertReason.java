package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason for a confidence level alert on delivery estimates.
 */

public enum CampaignPlanningConfidenceLevelAlertReason {

    UNKNOWN("UNKNOWN"),
    OTHER("OTHER"),
    ADVERTISER_HAS_NO_RECENT_CAMPAIGNS("ADVERTISER_HAS_NO_RECENT_CAMPAIGNS"),
    ADVERTISER_HAS_NO_RECENT_CONVERSIONS("ADVERTISER_HAS_NO_RECENT_CONVERSIONS");

    private String value;

    CampaignPlanningConfidenceLevelAlertReason(String value) {
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
    public static CampaignPlanningConfidenceLevelAlertReason fromValue(String text) {
        for (CampaignPlanningConfidenceLevelAlertReason b : CampaignPlanningConfidenceLevelAlertReason.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

