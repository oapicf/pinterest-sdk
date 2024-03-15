package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ActionType {

    @JsonProperty("CLICKTHROUGH") CLICKTHROUGH(String.valueOf("CLICKTHROUGH")), @JsonProperty("IMPRESSION") IMPRESSION(String.valueOf("IMPRESSION")), @JsonProperty("VIDEO_V_50_MRC") VIDEO_V_50_MRC(String.valueOf("VIDEO_V_50_MRC"));


    private String value;

    ActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ActionType fromValue(String value) {
        for (ActionType b : ActionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



