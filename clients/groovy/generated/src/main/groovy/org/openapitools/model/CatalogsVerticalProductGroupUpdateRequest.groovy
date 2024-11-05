package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupUpdateRequest;
import org.openapitools.model.CatalogsHotelProductGroupUpdateRequest;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsRetailProductGroupUpdateRequest;
import org.openapitools.model.Country;

@Canonical
class CatalogsVerticalProductGroupUpdateRequest {

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
    
    String name
    
    String description
    
    CatalogsCreativeAssetsProductGroupFilters filters
    
    Country country
    
    CatalogsLocale locale
}
