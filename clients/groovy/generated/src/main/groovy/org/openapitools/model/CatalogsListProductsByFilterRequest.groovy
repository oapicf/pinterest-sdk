package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsListProductsByFeedBasedFilter;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.Country;

@Canonical
class CatalogsListProductsByFilterRequest {
    /* Catalog Feed id pertaining to the catalog product group filter. */
    String feedId
    
    CatalogsProductGroupFilters filters
}
