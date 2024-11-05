package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * bid option field to apply operation updates to
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum UpdateMaskBidOptionField {

    @JsonProperty("BID") BID(String.valueOf("BID")), @JsonProperty("APP_TYPE_BID_MULTIPLIER_SET") APP_TYPE_BID_MULTIPLIER_SET(String.valueOf("APP_TYPE_BID_MULTIPLIER_SET")), @JsonProperty("PLACEMENT_BID_MULTIPLIER_SET") PLACEMENT_BID_MULTIPLIER_SET(String.valueOf("PLACEMENT_BID_MULTIPLIER_SET"));


    private String value;

    UpdateMaskBidOptionField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UpdateMaskBidOptionField fromValue(String value) {
        for (UpdateMaskBidOptionField b : UpdateMaskBidOptionField.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



