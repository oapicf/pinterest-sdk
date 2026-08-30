package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Error code returned for a campaign planning estimate failure.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignPlanningResponseErrorCode {

    @JsonProperty("SERVER_ERROR") SERVER_ERROR(String.valueOf("SERVER_ERROR")), @JsonProperty("AUDIENCE_LIST_MISSING") AUDIENCE_LIST_MISSING(String.valueOf("AUDIENCE_LIST_MISSING")), @JsonProperty("INVALID_REQUEST") INVALID_REQUEST(String.valueOf("INVALID_REQUEST")), @JsonProperty("PRODUCT_GROUP_MISSING") PRODUCT_GROUP_MISSING(String.valueOf("PRODUCT_GROUP_MISSING"));


    private String value;

    CampaignPlanningResponseErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignPlanningResponseErrorCode fromValue(String value) {
        for (CampaignPlanningResponseErrorCode b : CampaignPlanningResponseErrorCode.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



