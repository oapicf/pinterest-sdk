package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedProcessingStatus;

@Canonical
class CatalogsFeedIngestion {
    
    String id
    
    String feedId
    
    Date createdAt
    
    CatalogsFeedProcessingStatus status
}
