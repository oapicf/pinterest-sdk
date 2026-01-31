package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;

@Canonical
class IntegrationsLogsPost400Response {
    
    Integer code
    
    String message
    
    Object details
}
