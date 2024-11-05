package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsProductMetadata;
import org.openapitools.model.Pin;

@Canonical
class CatalogsCreativeAssetsProduct {

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
    
    CatalogsCreativeAssetsProductMetadata metadata
    
    Pin pin
}
