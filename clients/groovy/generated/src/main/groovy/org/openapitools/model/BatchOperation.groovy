package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BatchOperation {

    UPDATE("UPDATE"),
    
    UPSERT("UPSERT"),
    
    CREATE("CREATE"),
    
    DELETE_DISCONTINUED("DELETE_DISCONTINUED"),
    
    DELETE("DELETE")

    private final String value

    BatchOperation(String value) {
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
