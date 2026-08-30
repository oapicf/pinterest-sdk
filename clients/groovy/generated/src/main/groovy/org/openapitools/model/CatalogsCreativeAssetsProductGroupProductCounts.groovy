package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CatalogsCreativeAssetsProductGroupProductCounts {
    
    BigDecimal appLinks

    enum CatalogTypeEnum {
    
        CREATIVE_ASSETS("CREATIVE_ASSETS")
    
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
    
    BigDecimal images
    
    BigDecimal total
    
    BigDecimal videos
}
