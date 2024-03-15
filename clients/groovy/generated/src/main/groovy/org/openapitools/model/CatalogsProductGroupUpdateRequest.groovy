package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;

@Canonical
class CatalogsProductGroupUpdateRequest {
    
    String name
    
    String description
    /* boolean indicator of whether the product group is being featured or not */
    Boolean isFeatured
    
    CatalogsProductGroupFiltersRequest filters
}
