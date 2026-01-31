package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;

@Canonical
class CatalogsCreativeAssetsProductGroup {
    /* Catalog id pertaining to the creative assets product group. */
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
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    
    String description
    
    CatalogsCreativeAssetsProductGroupFilters filters
    /* ID of the creative assets product group. */
    String id
    /* Name of creative assets product group */
    String name
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
}
