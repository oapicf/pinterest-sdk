package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelProductMetadata;
import org.openapitools.model.Pin;

@Canonical
class CatalogsHotelProduct {

    enum CatalogTypeEnum {
    
        HOTEL("HOTEL")
    
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
    
    CatalogsHotelProductMetadata metadata
    
    Pin pin
}
