package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsHotelProductGroupFilterKeys;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsHotelProductGroupFiltersAnyOf;

@Canonical
class CatalogsHotelProductGroupFilters {
    
    List<CatalogsHotelProductGroupFilterKeys> anyOf = new ArrayList<>()
    
    List<CatalogsHotelProductGroupFilterKeys> allOf = new ArrayList<>()
}
