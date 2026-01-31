package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MediaUploadParameters {
    
    String contentType
    
    String key
    
    String policy
    
    String xAmzAlgorithm
    
    String xAmzCredential
    
    String xAmzDate
    
    String xAmzSecurityToken
    
    String xAmzSignature
}
