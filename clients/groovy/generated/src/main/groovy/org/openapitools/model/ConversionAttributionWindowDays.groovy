package org.openapitools.model;

import groovy.transform.Canonical
import java.math.BigDecimal;

enum ConversionAttributionWindowDays {

    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_7(new BigDecimal("7")),
    
    NUMBER_14(new BigDecimal("14")),
    
    NUMBER_30(new BigDecimal("30")),
    
    NUMBER_60(new BigDecimal("60"))

    private final BigDecimal value

    ConversionAttributionWindowDays(BigDecimal value) {
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
