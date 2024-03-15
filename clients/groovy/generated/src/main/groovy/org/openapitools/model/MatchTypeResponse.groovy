package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MatchTypeResponse {

    BROAD("BROAD"),
    
    PHRASE("PHRASE"),
    
    EXACT("EXACT"),
    
    EXACT_NEGATIVE("EXACT_NEGATIVE"),
    
    PHRASE_NEGATIVE("PHRASE_NEGATIVE"),
    
    NULL("null")

    private final String value

    MatchTypeResponse(String value) {
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
