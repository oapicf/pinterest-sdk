package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemValidationEvent;

@Canonical
class CatalogsHotelItemErrorResponse {

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
    /* Array with the errors for the item id requested */
    List<ItemValidationEvent> errors = new ArrayList<>()
    /* The catalog hotel id in the merchant namespace */
    String hotelId

    enum ItemResponseKindEnum {
    
        HOTEL_ITEM_ERROR("hotel_item_error")
    
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
