package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdGroupSummaryStatus {

    RUNNING("RUNNING"),
    
    PAUSED("PAUSED"),
    
    NOT_STARTED("NOT_STARTED"),
    
    COMPLETED("COMPLETED"),
    
    ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
    
    ARCHIVED("ARCHIVED"),
    
    DRAFT("DRAFT"),
    
    DELETED_DRAFT("DELETED_DRAFT")

    private final String value

    AdGroupSummaryStatus(String value) {
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
