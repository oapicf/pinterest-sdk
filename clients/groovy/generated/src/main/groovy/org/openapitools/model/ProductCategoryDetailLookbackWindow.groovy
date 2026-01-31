package org.openapitools.model;

import groovy.transform.Canonical
import java.math.BigDecimal;

enum ProductCategoryDetailLookbackWindow {

    NUMBER_90(new BigDecimal("90")),
    
    NUMBER_180(new BigDecimal("180")),
    
    NUMBER_365(new BigDecimal("365")),
    
    NUMBER_730(new BigDecimal("730"))

    private final BigDecimal value

    ProductCategoryDetailLookbackWindow(BigDecimal value) {
        this.value = value
    }

    BigDecimal getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
