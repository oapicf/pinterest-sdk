package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadataImages;

@Canonical
class ImageMetadata {
    
    String itemType
    
    String title
    
    String description
    
    String link
    
    ImageMetadataImages images
}
