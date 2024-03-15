package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ConversionApiResponseEventsInner;

@Canonical
class ConversionApiResponse {
    /* Total number of events received in the request. */
    Integer numEventsReceived
    /* Number of events that were successfully processed from the events. */
    Integer numEventsProcessed
    /* Specific messages for each event received. The order will match the order in which the events were received in the request. */
    List<ConversionApiResponseEventsInner> events = new ArrayList<>()
}
