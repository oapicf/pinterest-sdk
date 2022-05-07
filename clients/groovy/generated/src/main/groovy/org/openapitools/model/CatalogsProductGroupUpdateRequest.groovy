package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;

@Canonical
class CatalogsProductGroupUpdateRequest {
    /* Catalog Feed id pertaining to the catalog product group. */
    String feedId
    
    String name
    
    String description
    
    CatalogsProductGroupFilters filters
}
