package org.openapitools.model;

import groovy.transform.Canonical

enum ChangeHistoryOperationType {

    CREATE("CREATE"),
    
    UPDATE("UPDATE"),
    
    DELETE("DELETE")

    private final String value

    ChangeHistoryOperationType(String value) {
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
