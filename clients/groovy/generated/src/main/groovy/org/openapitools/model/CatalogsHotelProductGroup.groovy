package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupFilters;

@Canonical
class CatalogsHotelProductGroup {

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
    /* ID of the hotel product group. */
    String id
    /* Name of hotel product group */
    String name
    
    String description
    
    CatalogsHotelProductGroupFilters filters
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
    
    String catalogId
}
