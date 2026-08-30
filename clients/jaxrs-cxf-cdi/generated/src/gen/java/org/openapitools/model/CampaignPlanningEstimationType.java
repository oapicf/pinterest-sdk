package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Estimation type for campaign planning estimated curve
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignPlanningEstimationType {

    @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("CLICK") CLICK(String.valueOf("CLICK")), @JsonProperty("CONVERSION") CONVERSION(String.valueOf("CONVERSION")), @JsonProperty("WEEKLY_FREQUENCY") WEEKLY_FREQUENCY(String.valueOf("WEEKLY_FREQUENCY")), @JsonProperty("WEEKLY_REACH") WEEKLY_REACH(String.valueOf("WEEKLY_REACH")), @JsonProperty("LIFETIME_FREQUENCY") LIFETIME_FREQUENCY(String.valueOf("LIFETIME_FREQUENCY")), @JsonProperty("LIFETIME_REACH") LIFETIME_REACH(String.valueOf("LIFETIME_REACH")), @JsonProperty("CPM") CPM(String.valueOf("CPM")), @JsonProperty("CPC") CPC(String.valueOf("CPC")), @JsonProperty("CPA") CPA(String.valueOf("CPA"));


    private String value;

    CampaignPlanningEstimationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignPlanningEstimationType fromValue(String value) {
        for (CampaignPlanningEstimationType b : CampaignPlanningEstimationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



