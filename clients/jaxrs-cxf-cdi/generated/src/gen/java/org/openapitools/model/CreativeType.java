package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ad creative type enum. For update, only draft ads may update creative type. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CreativeType {

    @JsonProperty("REGULAR") REGULAR(String.valueOf("REGULAR")), @JsonProperty("VIDEO") VIDEO(String.valueOf("VIDEO")), @JsonProperty("SHOPPING") SHOPPING(String.valueOf("SHOPPING")), @JsonProperty("CAROUSEL") CAROUSEL(String.valueOf("CAROUSEL")), @JsonProperty("MAX_VIDEO") MAX_VIDEO(String.valueOf("MAX_VIDEO")), @JsonProperty("SHOP_THE_PIN") SHOP_THE_PIN(String.valueOf("SHOP_THE_PIN")), @JsonProperty("COLLECTION") COLLECTION(String.valueOf("COLLECTION")), @JsonProperty("IDEA") IDEA(String.valueOf("IDEA")), @JsonProperty("SHOWCASE") SHOWCASE(String.valueOf("SHOWCASE")), @JsonProperty("QUIZ") QUIZ(String.valueOf("QUIZ"));


    private String value;

    CreativeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CreativeType fromValue(String value) {
        for (CreativeType b : CreativeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



