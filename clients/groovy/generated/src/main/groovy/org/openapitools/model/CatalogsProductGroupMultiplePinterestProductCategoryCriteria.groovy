package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductCategoryEnum;

@Canonical
class CatalogsProductGroupMultiplePinterestProductCategoryCriteria {
    
    Boolean negated
    
    List<ProductCategoryEnum> values = new ArrayList<>()
}
