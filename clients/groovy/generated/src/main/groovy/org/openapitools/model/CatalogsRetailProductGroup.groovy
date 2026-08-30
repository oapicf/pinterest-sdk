package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;

@Canonical
class CatalogsRetailProductGroup {
    /* Catalog ID pertaining to the product group. */
    String catalogId

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

    
    CatalogTypeEnum catalogType
    
    String country
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    
    String description
    /* id of the catalogs feed belonging to this catalog product group */
    String feedId
    
    CatalogsProductGroupFilters filters
    /* ID of the catalog product group. */
    String id
    /* boolean indicator of whether the product group is being featured or not */
    Boolean isFeatured
    
    String locale
    /* Name of catalog product group */
    String name
    
    CatalogsProductGroupStatus status
    
    CatalogsProductGroupType type
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
}
