package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ScheduleType {

    CAMPAIGN_BUDGET_CHANGE("CAMPAIGN_BUDGET_CHANGE"),
    
    CAMPAIGN_BID_MULTIPLIERS("CAMPAIGN_BID_MULTIPLIERS")

    private final String value

    ScheduleType(String value) {
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
