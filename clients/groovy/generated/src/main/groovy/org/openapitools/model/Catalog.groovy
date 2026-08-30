package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsType;

@Canonical
class Catalog {
    
    CatalogsType catalogType
    
    Date createdAt
    /* ID of the catalog entity. */
    String id
    /* A human-friendly name associated to a catalog entity. */
    String name
    
    Date updatedAt
}
