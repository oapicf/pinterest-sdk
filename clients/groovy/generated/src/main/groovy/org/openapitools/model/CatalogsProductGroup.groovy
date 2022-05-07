package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;

@Canonical
class CatalogsProductGroup {
    /* ID of the catalog product group. */
    String id
    /* Name of catalog product group */
    String name
    
    String description
    
    CatalogsProductGroupFilters filters
    
    CatalogsProductGroupType type
    
    CatalogsProductGroupStatus status
    /* id of the catalogs feed belonging to this catalog product group */
    String feedId
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
}
