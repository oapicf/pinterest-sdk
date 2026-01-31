package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelProductGroupFilters;
import org.openapitools.model.CatalogsHotelProductGroupType;

@Canonical
class CatalogsHotelProductGroup {
    /* Catalog id pertaining to the hotel product group. */
    String catalogId

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
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    
    String description
    
    CatalogsHotelProductGroupFilters filters
    /* ID of the hotel product group. */
    String id
    /* Name of hotel product group */
    String name
    
    CatalogsHotelProductGroupType type
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
}
