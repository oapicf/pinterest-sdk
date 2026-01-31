package org.openapitools.model;

import groovy.transform.Canonical

enum TargetingSpecAgeBucket {

    _18_24("18-24"),
    
    _19_("19+"),
    
    _20_("20+"),
    
    _21_("21+"),
    
    _25_34("25-34"),
    
    _35_44("35-44"),
    
    _45_49("45-49"),
    
    _50_54("50-54"),
    
    _55_64("55-64"),
    
    _65_("65+")

    private final String value

    TargetingSpecAgeBucket(String value) {
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
