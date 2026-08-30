package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum HttpMethod {

    GET("GET"),
    
    HEAD("HEAD"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    DELETE("DELETE"),
    
    CONNECT("CONNECT"),
    
    OPTIONS("OPTIONS"),
    
    TRACE("TRACE"),
    
    PATCH("PATCH")

    private final String value

    HttpMethod(String value) {
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
