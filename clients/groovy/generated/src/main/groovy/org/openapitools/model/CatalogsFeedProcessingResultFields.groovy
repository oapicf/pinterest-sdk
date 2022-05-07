package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionDetails;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.openapitools.model.CatalogsFeedProductCounts;
import org.openapitools.model.CatalogsFeedValidationDetails;

@Canonical
class CatalogsFeedProcessingResultFields {
    
    CatalogsFeedIngestionDetails ingestionDetails
    
    CatalogsFeedProcessingStatus status
    
    CatalogsFeedProductCounts productCounts
    
    CatalogsFeedValidationDetails validationDetails
}
