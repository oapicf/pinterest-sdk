package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion attribution window in days.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignPlanningConversionAttributionWindowDays {

    @JsonProperty("DAYS_0") DAYS_0(String.valueOf("DAYS_0")), @JsonProperty("DAYS_1") DAYS_1(String.valueOf("DAYS_1")), @JsonProperty("DAYS_7") DAYS_7(String.valueOf("DAYS_7")), @JsonProperty("DAYS_30") DAYS_30(String.valueOf("DAYS_30")), @JsonProperty("DAYS_60") DAYS_60(String.valueOf("DAYS_60"));


    private String value;

    CampaignPlanningConversionAttributionWindowDays(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignPlanningConversionAttributionWindowDays fromValue(String value) {
        for (CampaignPlanningConversionAttributionWindowDays b : CampaignPlanningConversionAttributionWindowDays.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



