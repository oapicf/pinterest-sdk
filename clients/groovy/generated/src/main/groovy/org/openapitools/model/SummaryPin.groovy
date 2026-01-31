package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinMedia;

@Canonical
class SummaryPin {
    
    String altText
    
    String description
    
    String id
    
    String link
    
    PinMedia media
    
    String title
}
