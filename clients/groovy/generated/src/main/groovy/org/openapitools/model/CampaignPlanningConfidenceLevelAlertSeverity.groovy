package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignPlanningConfidenceLevelAlertSeverity {

    UNKNOWN("UNKNOWN"),
    
    LOW_MILD("LOW_MILD"),
    
    LOW_MODERATE("LOW_MODERATE"),
    
    LOW_SEVERE("LOW_SEVERE")

    private final String value

    CampaignPlanningConfidenceLevelAlertSeverity(String value) {
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
