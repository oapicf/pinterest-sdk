package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CatalogsRetailProductGroupProductCounts {

    enum CatalogTypeEnum {
    
        RETAIL("RETAIL")
    
        private final String value
    
        CatalogTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    CatalogTypeEnum catalogType
    
    BigDecimal inStock
    
    BigDecimal outOfStock
    
    BigDecimal preorder
    
    BigDecimal total
    
    BigDecimal videos
}
