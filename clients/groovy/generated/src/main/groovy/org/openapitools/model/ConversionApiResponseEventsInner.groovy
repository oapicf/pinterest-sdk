package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ConversionApiResponseEventsInner {

    enum StatusEnum {
    
        FAILED("failed"),
        
        PROCESSED("processed")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* Whether the event was processed successfully. */
    StatusEnum status
    /* Error message containing more information about why the event failed to be processed. */
    String errorMessage
    /* Warning messages about any fields in the event which are not standard. These are not critical to event processing. */
    String warningMessage
}
