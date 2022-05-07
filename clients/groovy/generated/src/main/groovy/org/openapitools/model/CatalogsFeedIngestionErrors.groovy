package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedIngestionErrors {
    
    Integer imageDownloadError
    
    Integer imageDownloadConnectionTimeout
    
    Integer imageFormatUnrecognize
    
    Integer lineLevelInternalError
    
    Integer largeProductCountDecrease
}
