package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdGroupAudienceSizingCreativeTypes {

    @JsonProperty("REGULAR") REGULAR(String.valueOf("REGULAR")), @JsonProperty("VIDEO") VIDEO(String.valueOf("VIDEO")), @JsonProperty("SHOPPING") SHOPPING(String.valueOf("SHOPPING")), @JsonProperty("CAROUSEL") CAROUSEL(String.valueOf("CAROUSEL")), @JsonProperty("MAX_VIDEO") MAX_VIDEO(String.valueOf("MAX_VIDEO")), @JsonProperty("SHOP_THE_PIN") SHOP_THE_PIN(String.valueOf("SHOP_THE_PIN")), @JsonProperty("COLLECTION") COLLECTION(String.valueOf("COLLECTION")), @JsonProperty("IDEA") IDEA(String.valueOf("IDEA"));


    private String value;

    AdGroupAudienceSizingCreativeTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdGroupAudienceSizingCreativeTypes fromValue(String value) {
        for (AdGroupAudienceSizingCreativeTypes b : AdGroupAudienceSizingCreativeTypes.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



