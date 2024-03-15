package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum UserListType {

    EMAIL("EMAIL"),
    
    IDFA("IDFA"),
    
    MAID("MAID"),
    
    LR_ID("LR_ID"),
    
    DLX_ID("DLX_ID"),
    
    HASHED_PINNER_ID("HASHED_PINNER_ID")

    private final String value

    UserListType(String value) {
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
