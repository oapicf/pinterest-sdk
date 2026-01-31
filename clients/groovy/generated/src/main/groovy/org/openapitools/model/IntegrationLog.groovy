package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;

@Canonical
class IntegrationLog {
    
    String advertiserId
    /* Version number of the integration application. */
    String appVersionNumber
    /* Timestamp in milliseconds of when the log was executed at the client. */
    Integer clientTimestamp
    
    IntegrationLogClientError error

    enum EventTypeEnum {
    
        APP("APP"),
        
        API("API")
    
        private final String value
    
        EventTypeEnum(String value) {
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

    /* Log event type */
    EventTypeEnum eventType
    
    String externalBusinessId
    
    String feedProfileId

    enum LogLevelEnum {
    
        INFO("INFO"),
        
        WARN("WARN"),
        
        ERROR("ERROR")
    
        private final String value
    
        LogLevelEnum(String value) {
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

    /* Log level type */
    LogLevelEnum logLevel
    
    String merchantId
    /* Explanation of the event that occured. */
    String message
    /* Version number of the platform the integration application is running on. */
    String platformVersionNumber
    
    IntegrationLogClientRequest request
    
    String tagId
}
