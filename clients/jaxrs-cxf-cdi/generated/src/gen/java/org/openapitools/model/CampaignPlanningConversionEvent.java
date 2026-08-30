package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion event for which a conversion rate estimate is computed.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignPlanningConversionEvent {

    @JsonProperty("SIGNUP") SIGNUP(String.valueOf("SIGNUP")), @JsonProperty("CHECKOUT") CHECKOUT(String.valueOf("CHECKOUT")), @JsonProperty("ADD_TO_CART") ADD_TO_CART(String.valueOf("ADD_TO_CART")), @JsonProperty("LEAD") LEAD(String.valueOf("LEAD"));


    private String value;

    CampaignPlanningConversionEvent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignPlanningConversionEvent fromValue(String value) {
        for (CampaignPlanningConversionEvent b : CampaignPlanningConversionEvent.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



