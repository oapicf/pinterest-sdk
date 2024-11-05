package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilterKeys;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFiltersAllOf;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFiltersAnyOf;

@Canonical
class CatalogsCreativeAssetsProductGroupFilters {
    
    List<CatalogsCreativeAssetsProductGroupFilterKeys> anyOf = new ArrayList<>()
    
    List<CatalogsCreativeAssetsProductGroupFilterKeys> allOf = new ArrayList<>()
}
