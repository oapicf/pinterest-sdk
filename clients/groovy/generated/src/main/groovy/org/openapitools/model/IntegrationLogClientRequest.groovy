package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.HttpMethod;

@Canonical
class IntegrationLogClientRequest {
    /* HTTP request host from host header. */
    String host
    
    HttpMethod method
    /* HTTP request path. */
    String path
    /* HTTP request headers as key-value pairs. */
    Map<String, String> requestHeaders = new HashMap<>()
    /* HTTP response headers as key-value pairs. */
    Map<String, String> responseHeaders = new HashMap<>()
    
    Integer responseStatusCode
}
