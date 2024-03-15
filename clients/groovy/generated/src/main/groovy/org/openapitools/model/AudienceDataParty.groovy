package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudienceDataParty {

    _1P("1p"),
    
    _3P("3p")

    private final String value

    AudienceDataParty(String value) {
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
