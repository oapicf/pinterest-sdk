package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class IntegrationLogClientRequest {

    enum MethodEnum {
    
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
    
        MethodEnum(String value) {
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

    
    MethodEnum method
    /* HTTP request host from host header. */
    String host
    /* HTTP request path. */
    String path
    /* HTTP request headers as key-value pairs. */
    Map<String, String> requestHeaders = new HashMap<>()
    /* HTTP response headers as key-value pairs. */
    Map<String, String> responseHeaders = new HashMap<>()
    
    Integer responseStatusCode
}
