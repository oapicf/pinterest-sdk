package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConversionTagType;

@Canonical
class ConversionEventResponse {
    
    ConversionTagType conversionEvent
    /* Id of the tag. */
    String conversionTagId
    /* Id of the ad account. */
    String adAccountId
    /* Creation date in epoch format. */
    Integer createdTime
}
