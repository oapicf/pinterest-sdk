package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ContentType;

@Canonical
class PinMediaSourceImagesBase64Item {
    
    ContentType contentType
    
    String data
    
    String description
    
    String link
    
    String title
}
