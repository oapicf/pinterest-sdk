package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionTagTypeOptimal;

@Canonical
class AdvertiserDefinedEvent {
    /* Standard type mapped to ADE for optimization */
    ConversionTagTypeOptimal mappedConversionType
    /* Raw string name of the event, usually logged as raw_event_name in our dataset */
    String name
}
