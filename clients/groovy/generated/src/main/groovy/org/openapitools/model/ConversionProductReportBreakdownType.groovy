package org.openapitools.model;

import groovy.transform.Canonical

enum ConversionProductReportBreakdownType {

    PRODUCT_BRAND("PRODUCT_BRAND"),
    
    PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
    
    PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
    
    PRODUCT_SKU("PRODUCT_SKU"),
    
    PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP")

    private final String value

    ConversionProductReportBreakdownType(String value) {
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
