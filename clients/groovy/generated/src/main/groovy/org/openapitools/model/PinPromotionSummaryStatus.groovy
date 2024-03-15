package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PinPromotionSummaryStatus {

    APPROVED("APPROVED"),
    
    PAUSED("PAUSED"),
    
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
    
    ARCHIVED("ARCHIVED"),
    
    DRAFT("DRAFT"),
    
    DELETED_DRAFT("DELETED_DRAFT")

    private final String value

    PinPromotionSummaryStatus(String value) {
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
