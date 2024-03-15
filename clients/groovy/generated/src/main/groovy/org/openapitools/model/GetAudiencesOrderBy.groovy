package org.openapitools.model;

import groovy.transform.Canonical

enum GetAudiencesOrderBy {

    NONE("NONE"),
    
    ID("ID"),
    
    SIZE("SIZE"),
    
    CREATION_DATE("CREATION_DATE"),
    
    UPDATED_TIME("UPDATED_TIME"),
    
    NAME("NAME"),
    
    STATUS("STATUS"),
    
    TYPE("TYPE")

    private final String value

    GetAudiencesOrderBy(String value) {
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
