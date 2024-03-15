package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SummaryPinMedia;

@Canonical
class SummaryPin {
    
    SummaryPinMedia media
    
    String altText
    
    String link
    
    String title
    
    String description
}
