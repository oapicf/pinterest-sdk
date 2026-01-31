package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum InterestsEnum {

    @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("ANIMALS") ANIMALS(String.valueOf("ANIMALS")), @JsonProperty("ARCHITECTURE") ARCHITECTURE(String.valueOf("ARCHITECTURE")), @JsonProperty("ART") ART(String.valueOf("ART")), @JsonProperty("BEAUTY") BEAUTY(String.valueOf("BEAUTY")), @JsonProperty("DIY_AND_CRAFTS") DIY_AND_CRAFTS(String.valueOf("DIY_AND_CRAFTS")), @JsonProperty("EDUCATION") EDUCATION(String.valueOf("EDUCATION")), @JsonProperty("EVENT_PLANNING") EVENT_PLANNING(String.valueOf("EVENT_PLANNING")), @JsonProperty("FASHION") FASHION(String.valueOf("FASHION")), @JsonProperty("FOOD_AND_DRINKS") FOOD_AND_DRINKS(String.valueOf("FOOD_AND_DRINKS")), @JsonProperty("GARDENING") GARDENING(String.valueOf("GARDENING")), @JsonProperty("HEALTH") HEALTH(String.valueOf("HEALTH")), @JsonProperty("HOME_DECOR") HOME_DECOR(String.valueOf("HOME_DECOR")), @JsonProperty("PARENTING") PARENTING(String.valueOf("PARENTING")), @JsonProperty("TRAVEL") TRAVEL(String.valueOf("TRAVEL")), @JsonProperty("WEDDING") WEDDING(String.valueOf("WEDDING"));


    private String value;

    InterestsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InterestsEnum fromValue(String value) {
        for (InterestsEnum b : InterestsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



