package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupFilters;

@Canonical
class CatalogsListProductsByFilterRequestOneOf {
    /* Catalog Feed id pertaining to the catalog product group filter. */
    String feedId
    
    CatalogsProductGroupFilters filters
}
