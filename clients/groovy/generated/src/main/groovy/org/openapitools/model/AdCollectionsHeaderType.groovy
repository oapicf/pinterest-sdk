package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AdCollectionsHeaderType {

    SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
    
    EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
    
    NO_HEADER("NO_HEADER")

    private final String value

    AdCollectionsHeaderType(String value) {
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
