package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MetricsReportingLevel {

    ADVERTISER("ADVERTISER"),
    
    ADVERTISER_TARGETING("ADVERTISER_TARGETING"),
    
    CAMPAIGN("CAMPAIGN"),
    
    CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    
    AD_GROUP("AD_GROUP"),
    
    AD_GROUP_TARGETING("AD_GROUP_TARGETING"),
    
    PIN_PROMOTION("PIN_PROMOTION"),
    
    PIN_PROMOTION_TARGETING("PIN_PROMOTION_TARGETING"),
    
    KEYWORD("KEYWORD"),
    
    PRODUCT_GROUP("PRODUCT_GROUP"),
    
    PRODUCT_GROUP_TARGETING("PRODUCT_GROUP_TARGETING"),
    
    PRODUCT_ITEM("PRODUCT_ITEM")

    private final String value

    MetricsReportingLevel(String value) {
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
