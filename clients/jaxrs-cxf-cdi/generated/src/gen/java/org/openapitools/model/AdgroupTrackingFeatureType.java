package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdgroupTrackingFeatureType {

    @JsonProperty("TRENDS") TRENDS(String.valueOf("TRENDS")), @JsonProperty("CLONE_META") CLONE_META(String.valueOf("CLONE_META")), @JsonProperty("BULK_EDITOR") BULK_EDITOR(String.valueOf("BULK_EDITOR")), @JsonProperty("AD_ROTATION") AD_ROTATION(String.valueOf("AD_ROTATION"));


    private String value;

    AdgroupTrackingFeatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdgroupTrackingFeatureType fromValue(String value) {
        for (AdgroupTrackingFeatureType b : AdgroupTrackingFeatureType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



