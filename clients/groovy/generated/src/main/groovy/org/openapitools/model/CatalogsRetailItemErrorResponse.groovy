package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemValidationEvent;

@Canonical
class CatalogsRetailItemErrorResponse {

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
    /* Array with the errors for the item id requested */
    List<ItemValidationEvent> errors = new ArrayList<>()
    /* The catalog item id in the merchant namespace */
    String itemId

    enum ItemResponseKindEnum {
    
        RETAIL_ITEM_ERROR("retail_item_error")
    
        private final String value
    
        ItemResponseKindEnum(String value) {
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

    /* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
    ItemResponseKindEnum itemResponseKind
}
