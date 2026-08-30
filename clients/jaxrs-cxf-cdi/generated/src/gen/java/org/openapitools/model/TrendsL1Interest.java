package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * L1 interest categories for filtering trends.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TrendsL1Interest {

    @JsonProperty("animals") ANIMALS(String.valueOf("animals")), @JsonProperty("architecture") ARCHITECTURE(String.valueOf("architecture")), @JsonProperty("art") ART(String.valueOf("art")), @JsonProperty("beauty") BEAUTY(String.valueOf("beauty")), @JsonProperty("childrens_fashion") CHILDRENS_FASHION(String.valueOf("childrens_fashion")), @JsonProperty("design") DESIGN(String.valueOf("design")), @JsonProperty("diy_and_crafts") DIY_AND_CRAFTS(String.valueOf("diy_and_crafts")), @JsonProperty("education") EDUCATION(String.valueOf("education")), @JsonProperty("electronics") ELECTRONICS(String.valueOf("electronics")), @JsonProperty("entertainment") ENTERTAINMENT(String.valueOf("entertainment")), @JsonProperty("event_planning") EVENT_PLANNING(String.valueOf("event_planning")), @JsonProperty("finance") FINANCE(String.valueOf("finance")), @JsonProperty("food_and_drinks") FOOD_AND_DRINKS(String.valueOf("food_and_drinks")), @JsonProperty("gardening") GARDENING(String.valueOf("gardening")), @JsonProperty("health") HEALTH(String.valueOf("health")), @JsonProperty("home_decor") HOME_DECOR(String.valueOf("home_decor")), @JsonProperty("mens_fashion") MENS_FASHION(String.valueOf("mens_fashion")), @JsonProperty("parenting") PARENTING(String.valueOf("parenting")), @JsonProperty("quotes") QUOTES(String.valueOf("quotes")), @JsonProperty("sport") SPORT(String.valueOf("sport")), @JsonProperty("travel") TRAVEL(String.valueOf("travel")), @JsonProperty("vehicles") VEHICLES(String.valueOf("vehicles")), @JsonProperty("wedding") WEDDING(String.valueOf("wedding")), @JsonProperty("womens_fashion") WOMENS_FASHION(String.valueOf("womens_fashion"));


    private String value;

    TrendsL1Interest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TrendsL1Interest fromValue(String value) {
        for (TrendsL1Interest b : TrendsL1Interest.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



