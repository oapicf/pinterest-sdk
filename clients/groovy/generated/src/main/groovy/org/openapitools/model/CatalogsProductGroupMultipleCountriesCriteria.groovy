package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Country;

@Canonical
class CatalogsProductGroupMultipleCountriesCriteria {
    
    List<Country> values = new ArrayList<>()
    
    Boolean negated = false
}
