package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MMMReportLevel {

    @JsonProperty("CAMPAIGN_TARGETING") CAMPAIGN_TARGETING(String.valueOf("CAMPAIGN_TARGETING")), @JsonProperty("AD_GROUP_TARGETING") AD_GROUP_TARGETING(String.valueOf("AD_GROUP_TARGETING"));


    private String value;

    MMMReportLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MMMReportLevel fromValue(String value) {
        for (MMMReportLevel b : MMMReportLevel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



