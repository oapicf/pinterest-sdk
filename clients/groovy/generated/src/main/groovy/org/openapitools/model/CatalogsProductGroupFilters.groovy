package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import org.openapitools.model.CatalogsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsProductGroupFiltersAnyOf;

@Canonical
class CatalogsProductGroupFilters {
    
    List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>()
    
    List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>()
}
