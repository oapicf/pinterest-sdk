package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Severity of a confidence level alert on delivery estimates.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignPlanningConfidenceLevelAlertSeverity {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("LOW_MILD") LOW_MILD(String.valueOf("LOW_MILD")), @JsonProperty("LOW_MODERATE") LOW_MODERATE(String.valueOf("LOW_MODERATE")), @JsonProperty("LOW_SEVERE") LOW_SEVERE(String.valueOf("LOW_SEVERE"));


    private String value;

    CampaignPlanningConfidenceLevelAlertSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignPlanningConfidenceLevelAlertSeverity fromValue(String value) {
        for (CampaignPlanningConfidenceLevelAlertSeverity b : CampaignPlanningConfidenceLevelAlertSeverity.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



