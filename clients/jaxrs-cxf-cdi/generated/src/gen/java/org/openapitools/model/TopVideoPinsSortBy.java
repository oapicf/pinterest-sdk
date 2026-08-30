package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sort metric for top video pins analytics.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TopVideoPinsSortBy {

    @JsonProperty("SAVE") SAVE(String.valueOf("SAVE")), @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("OUTBOUND_CLICK") OUTBOUND_CLICK(String.valueOf("OUTBOUND_CLICK")), @JsonProperty("VIDEO_MRC_VIEW") VIDEO_MRC_VIEW(String.valueOf("VIDEO_MRC_VIEW")), @JsonProperty("VIDEO_AVG_WATCH_TIME") VIDEO_AVG_WATCH_TIME(String.valueOf("VIDEO_AVG_WATCH_TIME")), @JsonProperty("VIDEO_V50_WATCH_TIME") VIDEO_V50_WATCH_TIME(String.valueOf("VIDEO_V50_WATCH_TIME")), @JsonProperty("QUARTILE_95_PERCENT_VIEW") QUARTILE_95_PERCENT_VIEW(String.valueOf("QUARTILE_95_PERCENT_VIEW")), @JsonProperty("VIDEO_10S_VIEW") VIDEO_10_S_VIEW(String.valueOf("VIDEO_10S_VIEW")), @JsonProperty("VIDEO_START") VIDEO_START(String.valueOf("VIDEO_START"));


    private String value;

    TopVideoPinsSortBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TopVideoPinsSortBy fromValue(String value) {
        for (TopVideoPinsSortBy b : TopVideoPinsSortBy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



