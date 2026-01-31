package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroup;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsHotelProductGroup;
import org.openapitools.model.CatalogsHotelProductGroupType;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsRetailProductGroup;

@Canonical
class CatalogsVerticalProductGroup {
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
    
    String country
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    
    String description
    /* id of the catalogs feed belonging to this catalog product group */
    String feedId
    
    CatalogsCreativeAssetsProductGroupFilters filters
    /* ID of the creative assets product group. */
    String id
    /* boolean indicator of whether the product group is being featured or not */
    Boolean isFeatured
    
    String locale
    /* Name of creative assets product group */
    String name
    
    CatalogsProductGroupStatus status
    
    CatalogsHotelProductGroupType type
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
}
