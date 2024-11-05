package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CatalogsProductGroupType {

    MERCHANT_CREATED("MERCHANT_CREATED"),
    
    ALL_PRODUCTS("ALL_PRODUCTS"),
    
    BEST_DEALS("BEST_DEALS"),
    
    PINNER_FAVORITES("PINNER_FAVORITES"),
    
    TOP_SELLERS("TOP_SELLERS"),
    
    BACK_IN_STOCK("BACK_IN_STOCK"),
    
    NEW_ARRIVALS("NEW_ARRIVALS"),
    
    SHOPIFY_COLLECTIONS("SHOPIFY_COLLECTIONS"),
    
    I2_PC("I2PC")

    private final String value

    CatalogsProductGroupType(String value) {
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
