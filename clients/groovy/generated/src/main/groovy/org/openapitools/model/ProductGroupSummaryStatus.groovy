package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ProductGroupSummaryStatus {

    RUNNING("RUNNING"),
    
    PAUSED("PAUSED"),
    
    EXCLUDED("EXCLUDED"),
    
    ARCHIVED("ARCHIVED")

    private final String value

    ProductGroupSummaryStatus(String value) {
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
