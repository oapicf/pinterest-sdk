package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LeadFormQuestionFieldType {

    TEXT_FIELD("TEXT_FIELD"),
    
    TEXT_AREA("TEXT_AREA"),
    
    RADIO_LIST("RADIO_LIST"),
    
    CHECKBOX("CHECKBOX"),
    
    NULL("null")

    private final String value

    LeadFormQuestionFieldType(String value) {
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
