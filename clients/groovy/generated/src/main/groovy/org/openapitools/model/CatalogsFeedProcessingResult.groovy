package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;
import org.openapitools.model.CatalogsFeedVideoCounts;

@Canonical
class CatalogsFeedProcessingResult {
    
    Date createdAt
    
    String id
    
    Date updatedAt
    
    CatalogsFeedIngestionDetails ingestionDetails
    
    CatalogsFeedProductCounts productCounts
    
    CatalogsFeedProcessingStatus status
    
    CatalogsFeedValidationDetails validationDetails
    
    CatalogsFeedVideoCounts videoCounts
}
