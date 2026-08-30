package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignPlanningConfidenceLevelAlertReason {

    UNKNOWN("UNKNOWN"),
    
    OTHER("OTHER"),
    
    ADVERTISER_HAS_NO_RECENT_CAMPAIGNS("ADVERTISER_HAS_NO_RECENT_CAMPAIGNS"),
    
    ADVERTISER_HAS_NO_RECENT_CONVERSIONS("ADVERTISER_HAS_NO_RECENT_CONVERSIONS")

    private final String value

    CampaignPlanningConfidenceLevelAlertReason(String value) {
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
