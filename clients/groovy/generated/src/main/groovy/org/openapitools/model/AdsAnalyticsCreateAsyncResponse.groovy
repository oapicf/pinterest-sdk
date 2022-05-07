package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AdsAnalyticsCreateAsyncResponse {
    
    String reportStatus
    
    String token
    
    String message
}
