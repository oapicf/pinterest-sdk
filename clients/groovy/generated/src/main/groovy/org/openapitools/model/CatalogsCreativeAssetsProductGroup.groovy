package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;

@Canonical
class CatalogsCreativeAssetsProductGroup {

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
    /* ID of the creative assets product group. */
    String id
    /* Name of creative assets product group */
    String name
    
    String description
    
    CatalogsCreativeAssetsProductGroupFilters filters
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
    /* Catalog id pertaining to the creative assets product group. */
    String catalogId
}
