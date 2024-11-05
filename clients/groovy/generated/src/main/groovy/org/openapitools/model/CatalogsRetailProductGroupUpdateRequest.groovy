package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.model.Country;

@Canonical
class CatalogsRetailProductGroupUpdateRequest {

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

    /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    CatalogTypeEnum catalogType
    
    String name
    
    String description
    
    CatalogsProductGroupFiltersRequest filters
    
    Country country
    
    CatalogsLocale locale
}
