package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IntegrationLogClientError;
import org.openapitools.model.IntegrationLogClientRequest;

@Canonical
class IntegrationLog {
    /* Timestamp in milliseconds of when the log was executed at the client. */
    Integer clientTimestamp

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
    
    String externalBusinessId
    
    String advertiserId
    
    String merchantId
    
    String tagId
    
    String feedProfileId
    /* Explanation of the event that occured. */
    String message
    /* Version number of the integration application. */
    String appVersionNumber
    /* Version number of the platform the integration application is running on. */
    String platformVersionNumber
    
    IntegrationLogClientError error
    
    IntegrationLogClientRequest request
}
