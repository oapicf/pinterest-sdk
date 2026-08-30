package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignPlanningResponseErrorCode {

    SERVER_ERROR("SERVER_ERROR"),
    
    AUDIENCE_LIST_MISSING("AUDIENCE_LIST_MISSING"),
    
    INVALID_REQUEST("INVALID_REQUEST"),
    
    PRODUCT_GROUP_MISSING("PRODUCT_GROUP_MISSING")

    private final String value

    CampaignPlanningResponseErrorCode(String value) {
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
