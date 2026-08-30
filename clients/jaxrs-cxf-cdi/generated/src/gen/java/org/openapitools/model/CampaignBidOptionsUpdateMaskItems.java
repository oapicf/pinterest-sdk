package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Fields that can be updated in campaign bid options.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignBidOptionsUpdateMaskItems {

    @JsonProperty("AUDIENCE") AUDIENCE(String.valueOf("AUDIENCE")), @JsonProperty("APP_TYPE") APP_TYPE(String.valueOf("APP_TYPE")), @JsonProperty("PLACEMENT") PLACEMENT(String.valueOf("PLACEMENT")), @JsonProperty("GENDER") GENDER(String.valueOf("GENDER")), @JsonProperty("AGE_BUCKET") AGE_BUCKET(String.valueOf("AGE_BUCKET")), @JsonProperty("FREQUENCY") FREQUENCY(String.valueOf("FREQUENCY"));


    private String value;

    CampaignBidOptionsUpdateMaskItems(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignBidOptionsUpdateMaskItems fromValue(String value) {
        for (CampaignBidOptionsUpdateMaskItems b : CampaignBidOptionsUpdateMaskItems.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



