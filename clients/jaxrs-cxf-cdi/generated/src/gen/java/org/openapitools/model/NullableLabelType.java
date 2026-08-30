package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum NullableLabelType {

    @JsonProperty("BRAND") BRAND(String.valueOf("BRAND")), @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    NullableLabelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NullableLabelType fromValue(String value) {
        for (NullableLabelType b : NullableLabelType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



