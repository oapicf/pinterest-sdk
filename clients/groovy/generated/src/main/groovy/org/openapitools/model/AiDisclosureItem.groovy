package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AiDisclosureItem {

    AI_MODIFIED("AI_MODIFIED"),
    
    SYNTHETIC_PERFORMER("SYNTHETIC_PERFORMER")

    private final String value

    AiDisclosureItem(String value) {
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
