package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceVideoID;

@Canonical
class PinMediaSource {
    
    String sourceType
    
    String contentType
    
    String data
    
    String url
    
    String coverImageUrl
    
    String mediaId
}
