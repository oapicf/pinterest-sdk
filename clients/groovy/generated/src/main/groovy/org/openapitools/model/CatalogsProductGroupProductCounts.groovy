package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CatalogsProductGroupProductCounts {
    
    BigDecimal inStock
    
    BigDecimal outOfStock
    
    BigDecimal preorder
    
    BigDecimal total
}
