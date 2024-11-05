package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupProductCounts;
import org.openapitools.model.CatalogsHotelProductGroupProductCounts;
import org.openapitools.model.CatalogsRetailProductGroupProductCounts;
import org.openapitools.model.CatalogsType;

@Canonical
class CatalogsProductGroupProductCountsVertical {
    
    CatalogsType catalogType
    
    BigDecimal inStock
    
    BigDecimal outOfStock
    
    BigDecimal preorder
    
    BigDecimal total
    
    BigDecimal videos
}
