package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TrendsL1Interest {

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
    
    WOMENS_FASHION("womens_fashion")

    private final String value

    TrendsL1Interest(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
