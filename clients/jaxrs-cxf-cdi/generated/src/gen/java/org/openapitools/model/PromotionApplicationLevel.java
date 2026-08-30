package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Specify if the promotion is applied at ad group or item level.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PromotionApplicationLevel {

    @JsonProperty("NONE") NONE(String.valueOf("NONE")), @JsonProperty("ITEM") ITEM(String.valueOf("ITEM")), @JsonProperty("AD_GROUP") AD_GROUP(String.valueOf("AD_GROUP"));


    private String value;

    PromotionApplicationLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PromotionApplicationLevel fromValue(String value) {
        for (PromotionApplicationLevel b : PromotionApplicationLevel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



