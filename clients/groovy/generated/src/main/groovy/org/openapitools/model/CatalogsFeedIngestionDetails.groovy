package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionErrors;
import org.openapitools.model.CatalogsFeedIngestionInfo;
import org.openapitools.model.CatalogsFeedIngestionWarnings;

@Canonical
class CatalogsFeedIngestionDetails {
    
    CatalogsFeedIngestionErrors errors
    
    CatalogsFeedIngestionInfo info
    
    CatalogsFeedIngestionWarnings warnings
}
