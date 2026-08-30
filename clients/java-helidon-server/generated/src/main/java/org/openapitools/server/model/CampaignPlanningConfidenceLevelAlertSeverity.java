package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Severity of a confidence level alert on delivery estimates.
 */

public enum CampaignPlanningConfidenceLevelAlertSeverity {

    UNKNOWN("UNKNOWN"),
    LOW_MILD("LOW_MILD"),
    LOW_MODERATE("LOW_MODERATE"),
    LOW_SEVERE("LOW_SEVERE");

    private String value;

    CampaignPlanningConfidenceLevelAlertSeverity(String value) {
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
    public static CampaignPlanningConfidenceLevelAlertSeverity fromValue(String text) {
        for (CampaignPlanningConfidenceLevelAlertSeverity b : CampaignPlanningConfidenceLevelAlertSeverity.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

