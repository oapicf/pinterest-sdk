package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsItemsPostFilters;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.Country;

@Canonical
class CatalogsItemsRequest {
    
    Country country
    
    CatalogsItemsRequestLanguage language
    
    CatalogsItemsPostFilters filters
}
