package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignPlanningConversionAttributionWindowDays {

    DAYS_0("DAYS_0"),
    
    DAYS_1("DAYS_1"),
    
    DAYS_7("DAYS_7"),
    
    DAYS_30("DAYS_30"),
    
    DAYS_60("DAYS_60")

    private final String value

    CampaignPlanningConversionAttributionWindowDays(String value) {
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
