package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdvertiserDefinedEventMappingType;

@Canonical
class AdvertiserDefinedEventInput {
    /* Pinterest standard event type to map this custom event to for campaign optimization and reporting */
    AdvertiserDefinedEventMappingType mappedConversionType
    /* Raw string name of the event */
    String name
}
