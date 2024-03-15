package org.openapitools.model;

import groovy.transform.Canonical

enum ConversionAttributionWindowDays {

    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_7(7),
    
    NUMBER_14(14),
    
    NUMBER_30(30),
    
    NUMBER_60(60)

    private final Integer value

    ConversionAttributionWindowDays(Integer value) {
        this.value = value
    }

    Integer getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
