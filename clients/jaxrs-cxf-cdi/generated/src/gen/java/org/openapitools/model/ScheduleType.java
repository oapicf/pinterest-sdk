package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The schedule type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ScheduleType {

    @JsonProperty("CAMPAIGN_BUDGET_CHANGE") CAMPAIGN_BUDGET_CHANGE(String.valueOf("CAMPAIGN_BUDGET_CHANGE")), @JsonProperty("CAMPAIGN_BID_MULTIPLIERS") CAMPAIGN_BID_MULTIPLIERS(String.valueOf("CAMPAIGN_BID_MULTIPLIERS"));


    private String value;

    ScheduleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ScheduleType fromValue(String value) {
        for (ScheduleType b : ScheduleType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



