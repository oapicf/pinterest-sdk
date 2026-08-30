package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Estimation type for campaign planning estimated curve
 */

public enum CampaignPlanningEstimationType {

    IMPRESSION("IMPRESSION"),
    CLICK("CLICK"),
    CONVERSION("CONVERSION"),
    WEEKLY_FREQUENCY("WEEKLY_FREQUENCY"),
    WEEKLY_REACH("WEEKLY_REACH"),
    LIFETIME_FREQUENCY("LIFETIME_FREQUENCY"),
    LIFETIME_REACH("LIFETIME_REACH"),
    CPM("CPM"),
    CPC("CPC"),
    CPA("CPA");

    private String value;

    CampaignPlanningEstimationType(String value) {
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
    public static CampaignPlanningEstimationType fromValue(String text) {
        for (CampaignPlanningEstimationType b : CampaignPlanningEstimationType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

