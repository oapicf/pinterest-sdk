package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AllOf;
import org.openapitools.model.AnyOf;
import org.openapitools.model.CatalogsProductGroupFilterKeys;

@Canonical
class CatalogsProductGroupFiltersRequest {
    
    List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>()
    
    List<CatalogsProductGroupFilterKeys> allOf = new ArrayList<>()
}
