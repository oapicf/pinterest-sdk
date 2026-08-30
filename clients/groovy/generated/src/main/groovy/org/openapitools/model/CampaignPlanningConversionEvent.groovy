package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignPlanningConversionEvent {

    SIGNUP("SIGNUP"),
    
    CHECKOUT("CHECKOUT"),
    
    ADD_TO_CART("ADD_TO_CART"),
    
    LEAD("LEAD")

    private final String value

    CampaignPlanningConversionEvent(String value) {
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
