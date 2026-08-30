package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CollectionsHeaderType {

    SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
    
    EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
    
    NO_HEADER("NO_HEADER"),
    
    ON_SALE("ON_SALE"),
    
    GET_DEAL("GET_DEAL")

    private final String value

    CollectionsHeaderType(String value) {
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
