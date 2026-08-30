package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.Pin;

@Canonical
class CatalogsHotelItemResponse {
    
    CatalogsHotelAttributes attributes

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
    /* The catalog hotel id in the merchant namespace */
    String hotelId

    enum ItemResponseKindEnum {
    
        HOTEL_ITEM("hotel_item")
    
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
    /* The pins mapped to the item */
    List<Pin> pins
}
