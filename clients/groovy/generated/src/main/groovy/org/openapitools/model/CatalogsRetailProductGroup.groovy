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
    /* ID of the catalog product group. */
    String id
    /* Name of catalog product group */
    String name
    
    String description
    
    CatalogsProductGroupFilters filters
    /* boolean indicator of whether the product group is being featured or not */
    Boolean isFeatured
    
    CatalogsProductGroupType type
    
    CatalogsProductGroupStatus status
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer updatedAt
    /* Catalog id pertaining to the retail product group. */
    String catalogId
    /* id of the catalogs feed belonging to this catalog product group */
    String feedId
    
    String country
    
    String locale
}
