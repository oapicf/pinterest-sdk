package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum NetworkType {

    WIFI("wifi"),
    
    CELLULAR_2G("cellular_2g"),
    
    CELLULAR_3G("cellular_3g"),
    
    CELLULAR_4G("cellular_4g"),
    
    CELLULAR_5G("cellular_5g"),
    
    CELLULAR_6G("cellular_6g"),
    
    ETHERNET("ethernet"),
    
    UNKNOWN("unknown")

    private final String value

    NetworkType(String value) {
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
