package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;

@Canonical
class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 {
    
    String description
    
    CatalogsProductGroupFiltersRequest filters
    /* boolean indicator of whether the product group is being featured or not */
    Boolean isFeatured
    
    String name
    /* ID of the product group. */
    String id
}
