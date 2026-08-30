package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupCreateRequest;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsHotelProductGroupCreateRequest;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsRetailProductGroupCreateRequest;
import org.openapitools.model.Country;

@Canonical
class CatalogsVerticalProductGroupCreateRequest {
    /* Catalog ID pertaining to the product group. */
    String catalogId

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
    
    Country country
    
    String description
    
    CatalogsCreativeAssetsProductGroupFilters filters
    
    CatalogsLocale locale
    
    String name
}
