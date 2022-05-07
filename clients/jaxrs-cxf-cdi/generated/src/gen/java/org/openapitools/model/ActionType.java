package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Ad group billable event type.
 **/

public enum ActionType {

    CLICKTHROUGH(String.valueOf("CLICKTHROUGH")), IMPRESSION(String.valueOf("IMPRESSION")), VIDEO_V_50_MRC(String.valueOf("VIDEO_V_50_MRC")), BILLABLE_ENGAGEMENT(String.valueOf("BILLABLE_ENGAGEMENT"));


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



