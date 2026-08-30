package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CatalogsAiContentDisclosureLabel {

    AI_MODIFIED("ai_modified"),
    
    SYNTHETIC_PERFORMER("synthetic_performer")

    private final String value

    CatalogsAiContentDisclosureLabel(String value) {
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
