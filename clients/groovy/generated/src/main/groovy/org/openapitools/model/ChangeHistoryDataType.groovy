package org.openapitools.model;

import groovy.transform.Canonical

enum ChangeHistoryDataType {

    STRING("STRING"),
    
    NUMERIC("NUMERIC"),
    
    MICROCURRENCY("MICROCURRENCY"),
    
    DATE("DATE"),
    
    BOOL("BOOL"),
    
    GENDER_LIST("GENDER_LIST"),
    
    AGE_BUCKET_LIST("AGE_BUCKET_LIST"),
    
    APPTYPE_LIST("APPTYPE_LIST"),
    
    COUNTRY_LIST("COUNTRY_LIST"),
    
    LOCALE_LIST("LOCALE_LIST")

    private final String value

    ChangeHistoryDataType(String value) {
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
