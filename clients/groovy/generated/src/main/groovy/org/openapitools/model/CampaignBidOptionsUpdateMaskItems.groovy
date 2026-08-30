package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CampaignBidOptionsUpdateMaskItems {

    AUDIENCE("AUDIENCE"),
    
    APP_TYPE("APP_TYPE"),
    
    PLACEMENT("PLACEMENT"),
    
    GENDER("GENDER"),
    
    AGE_BUCKET("AGE_BUCKET"),
    
    FREQUENCY("FREQUENCY")

    private final String value

    CampaignBidOptionsUpdateMaskItems(String value) {
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
