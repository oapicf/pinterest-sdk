package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignPlanningEstimationType {

    IMPRESSION("IMPRESSION"),
    
    CLICK("CLICK"),
    
    CONVERSION("CONVERSION"),
    
    WEEKLY_FREQUENCY("WEEKLY_FREQUENCY"),
    
    WEEKLY_REACH("WEEKLY_REACH"),
    
    LIFETIME_FREQUENCY("LIFETIME_FREQUENCY"),
    
    LIFETIME_REACH("LIFETIME_REACH"),
    
    CPM("CPM"),
    
    CPC("CPC"),
    
    CPA("CPA")

    private final String value

    CampaignPlanningEstimationType(String value) {
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
