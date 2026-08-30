package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum OsFamily {

    IOS("ios"),
    
    ANDROID("android"),
    
    MACOS("macos"),
    
    WINDOWS("windows"),
    
    LINUX("linux"),
    
    BSD("bsd"),
    
    OTHER("other")

    private final String value

    OsFamily(String value) {
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
