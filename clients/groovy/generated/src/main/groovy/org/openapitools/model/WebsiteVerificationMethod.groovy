package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum WebsiteVerificationMethod {

    FILENAME("FILENAME"),
    
    METATAG("METATAG"),
    
    DNSTXT("DNSTXT")

    private final String value

    WebsiteVerificationMethod(String value) {
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
