package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ScheduleAction {

    INCREASE_BY_VALUE("INCREASE_BY_VALUE"),
    
    INCREASE_BY_PERCENT("INCREASE_BY_PERCENT")

    private final String value

    ScheduleAction(String value) {
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
