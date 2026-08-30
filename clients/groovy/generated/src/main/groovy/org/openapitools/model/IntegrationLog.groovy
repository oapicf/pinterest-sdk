package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;
import org.openapitools.model.IntegrationLogEventType;
import org.openapitools.model.IntegrationLogLevel;

@Canonical
class IntegrationLog {
    
    String advertiserId
    /* Version number of the integration application. */
    String appVersionNumber
    /* Timestamp in milliseconds of when the log was executed at the client. */
    Integer clientTimestamp
    
    IntegrationLogClientError error
    /* Log event type */
    IntegrationLogEventType eventType
    
    String externalBusinessId
    
    String feedProfileId
    /* Log level type */
    IntegrationLogLevel logLevel
    
    String merchantId
    /* Explanation of the event that occured. */
    String message
    /* Version number of the platform the integration application is running on. */
    String platformVersionNumber
    
    IntegrationLogClientRequest request
    
    String tagId
}
