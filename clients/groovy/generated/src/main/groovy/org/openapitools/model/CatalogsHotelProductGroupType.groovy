package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CatalogsHotelProductGroupType {

    MERCHANT_CREATED("MERCHANT_CREATED"),
    
    ALL_LISTINGS("ALL_LISTINGS")

    private final String value

    CatalogsHotelProductGroupType(String value) {
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
