package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Reason for a confidence level alert on delivery estimates.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignPlanningConfidenceLevelAlertReason {

    @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")), @JsonProperty("ADVERTISER_HAS_NO_RECENT_CAMPAIGNS") ADVERTISER_HAS_NO_RECENT_CAMPAIGNS(String.valueOf("ADVERTISER_HAS_NO_RECENT_CAMPAIGNS")), @JsonProperty("ADVERTISER_HAS_NO_RECENT_CONVERSIONS") ADVERTISER_HAS_NO_RECENT_CONVERSIONS(String.valueOf("ADVERTISER_HAS_NO_RECENT_CONVERSIONS"));


    private String value;

    CampaignPlanningConfidenceLevelAlertReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignPlanningConfidenceLevelAlertReason fromValue(String value) {
        for (CampaignPlanningConfidenceLevelAlertReason b : CampaignPlanningConfidenceLevelAlertReason.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



