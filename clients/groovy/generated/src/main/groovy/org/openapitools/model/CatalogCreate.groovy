package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsType;

@Canonical
class CatalogCreate {
    
    CatalogsType catalogType
    /* A human-friendly name associated to a catalog entity. */
    String name
}
