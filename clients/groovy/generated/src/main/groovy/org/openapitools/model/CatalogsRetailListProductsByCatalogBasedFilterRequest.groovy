package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.Country;

@Canonical
class CatalogsRetailListProductsByCatalogBasedFilterRequest {

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
    /* Catalog id pertaining to the retail product group. */
    String catalogId
    
    CatalogsProductGroupFilters filters
    
    Country country
    
    CatalogsLocale locale
}
