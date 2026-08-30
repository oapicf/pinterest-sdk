package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The schedule action
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ScheduleAction {

    @JsonProperty("INCREASE_BY_VALUE") INCREASE_BY_VALUE(String.valueOf("INCREASE_BY_VALUE")), @JsonProperty("INCREASE_BY_PERCENT") INCREASE_BY_PERCENT(String.valueOf("INCREASE_BY_PERCENT"));


    private String value;

    ScheduleAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ScheduleAction fromValue(String value) {
        for (ScheduleAction b : ScheduleAction.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



