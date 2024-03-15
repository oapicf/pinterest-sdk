package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsType;

@Canonical
class Catalog {
    
    Date createdAt
    /* ID of the catalog entity. */
    String id
    
    Date updatedAt
    /* A human-friendly name associated to a catalog entity. */
    String name
    
    CatalogsType catalogType
}
