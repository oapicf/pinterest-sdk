package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum QuerypinanalyticsmetrictypesItems {

    @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("OUTBOUND_CLICK") OUTBOUND_CLICK(String.valueOf("OUTBOUND_CLICK")), @JsonProperty("PIN_CLICK") PIN_CLICK(String.valueOf("PIN_CLICK")), @JsonProperty("SAVE") SAVE(String.valueOf("SAVE")), @JsonProperty("SAVE_RATE") SAVE_RATE(String.valueOf("SAVE_RATE")), @JsonProperty("TOTAL_COMMENTS") TOTAL_COMMENTS(String.valueOf("TOTAL_COMMENTS")), @JsonProperty("TOTAL_REACTIONS") TOTAL_REACTIONS(String.valueOf("TOTAL_REACTIONS")), @JsonProperty("USER_FOLLOW") USER_FOLLOW(String.valueOf("USER_FOLLOW")), @JsonProperty("PROFILE_VISIT") PROFILE_VISIT(String.valueOf("PROFILE_VISIT")), @JsonProperty("VIDEO_MRC_VIEW") VIDEO_MRC_VIEW(String.valueOf("VIDEO_MRC_VIEW")), @JsonProperty("VIDEO_10S_VIEW") VIDEO_10_S_VIEW(String.valueOf("VIDEO_10S_VIEW")), @JsonProperty("QUARTILE_95_PERCENT_VIEW") QUARTILE_95_PERCENT_VIEW(String.valueOf("QUARTILE_95_PERCENT_VIEW")), @JsonProperty("VIDEO_V50_WATCH_TIME") VIDEO_V50_WATCH_TIME(String.valueOf("VIDEO_V50_WATCH_TIME")), @JsonProperty("VIDEO_START") VIDEO_START(String.valueOf("VIDEO_START")), @JsonProperty("VIDEO_AVG_WATCH_TIME") VIDEO_AVG_WATCH_TIME(String.valueOf("VIDEO_AVG_WATCH_TIME"));


    private String value;

    QuerypinanalyticsmetrictypesItems(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QuerypinanalyticsmetrictypesItems fromValue(String value) {
        for (QuerypinanalyticsmetrictypesItems b : QuerypinanalyticsmetrictypesItems.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



