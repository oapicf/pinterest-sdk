package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LabelStatusBulkUpdate {

    ARCHIVED("ARCHIVED")

    private final String value

    LabelStatusBulkUpdate(String value) {
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
