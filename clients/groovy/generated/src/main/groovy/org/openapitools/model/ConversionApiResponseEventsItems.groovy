package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventProcessingStatus;

@Canonical
class ConversionApiResponseEventsItems {
    /* Error message containing more information about why the event failed to be processed. */
    String errorMessage
    /* Whether the event was processed successfully. */
    EventProcessingStatus status
    /* Warning messages about any fields in the event which are not standard. These are not critical to event processing. */
    String warningMessage
}
