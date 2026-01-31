package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import org.openapitools.model.GenderDemographics;

@Canonical
class ProductCategoriesDemographic {
    /* Age demographic distribution */
    Map<String, BigDecimal> age = new HashMap<>()
    
    GenderDemographics gender
}
