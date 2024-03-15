package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedValidationErrors;
import org.openapitools.model.CatalogsFeedValidationWarnings;

@Canonical
class CatalogsFeedValidationDetails {
    
    CatalogsFeedValidationErrors errors
    
    CatalogsFeedValidationWarnings warnings
}
