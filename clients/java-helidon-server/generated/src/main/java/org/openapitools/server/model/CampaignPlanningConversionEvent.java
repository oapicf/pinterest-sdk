package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Conversion event for which a conversion rate estimate is computed.
 */

public enum CampaignPlanningConversionEvent {

    SIGNUP("SIGNUP"),
    CHECKOUT("CHECKOUT"),
    ADD_TO_CART("ADD_TO_CART"),
    LEAD("LEAD");

    private String value;

    CampaignPlanningConversionEvent(String value) {
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
    public static CampaignPlanningConversionEvent fromValue(String text) {
        for (CampaignPlanningConversionEvent b : CampaignPlanningConversionEvent.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

