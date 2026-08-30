package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * L1 interest categories for filtering trends.
 */

public enum TrendsL1Interest {

    ANIMALS("animals"),
    ARCHITECTURE("architecture"),
    ART("art"),
    BEAUTY("beauty"),
    CHILDRENS_FASHION("childrens_fashion"),
    DESIGN("design"),
    DIY_AND_CRAFTS("diy_and_crafts"),
    EDUCATION("education"),
    ELECTRONICS("electronics"),
    ENTERTAINMENT("entertainment"),
    EVENT_PLANNING("event_planning"),
    FINANCE("finance"),
    FOOD_AND_DRINKS("food_and_drinks"),
    GARDENING("gardening"),
    HEALTH("health"),
    HOME_DECOR("home_decor"),
    MENS_FASHION("mens_fashion"),
    PARENTING("parenting"),
    QUOTES("quotes"),
    SPORT("sport"),
    TRAVEL("travel"),
    VEHICLES("vehicles"),
    WEDDING("wedding"),
    WOMENS_FASHION("womens_fashion");

    private String value;

    TrendsL1Interest(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TrendsL1Interest fromValue(String text) {
        for (TrendsL1Interest b : TrendsL1Interest.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

