package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MatchType {

    BROAD("BROAD"),
    
    PHRASE("PHRASE"),
    
    EXACT("EXACT"),
    
    EXACT_NEGATIVE("EXACT_NEGATIVE"),
    
    PHRASE_NEGATIVE("PHRASE_NEGATIVE")

    private final String value

    MatchType(String value) {
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
