package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BidStrategyType {

    @JsonProperty("AUTOMATIC_BID") AUTOMATIC_BID(String.valueOf("AUTOMATIC_BID")), @JsonProperty("MAX_BID") MAX_BID(String.valueOf("MAX_BID")), @JsonProperty("TARGET_AVG") TARGET_AVG(String.valueOf("TARGET_AVG"));


    private String value;

    BidStrategyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BidStrategyType fromValue(String value) {
        for (BidStrategyType b : BidStrategyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



