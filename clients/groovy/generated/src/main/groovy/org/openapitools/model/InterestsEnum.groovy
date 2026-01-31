package org.openapitools.model;

import groovy.transform.Canonical

enum InterestsEnum {

    ALL("ALL"),
    
    ANIMALS("ANIMALS"),
    
    ARCHITECTURE("ARCHITECTURE"),
    
    ART("ART"),
    
    BEAUTY("BEAUTY"),
    
    DIY_AND_CRAFTS("DIY_AND_CRAFTS"),
    
    EDUCATION("EDUCATION"),
    
    EVENT_PLANNING("EVENT_PLANNING"),
    
    FASHION("FASHION"),
    
    FOOD_AND_DRINKS("FOOD_AND_DRINKS"),
    
    GARDENING("GARDENING"),
    
    HEALTH("HEALTH"),
    
    HOME_DECOR("HOME_DECOR"),
    
    PARENTING("PARENTING"),
    
    TRAVEL("TRAVEL"),
    
    WEDDING("WEDDING")

    private final String value

    InterestsEnum(String value) {
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
