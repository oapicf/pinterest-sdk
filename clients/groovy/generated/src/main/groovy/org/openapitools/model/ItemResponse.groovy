package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsCreativeAssetsItemErrorResponse;
import org.openapitools.model.CatalogsCreativeAssetsItemResponse;
import org.openapitools.model.CatalogsHotelItemErrorResponse;
import org.openapitools.model.CatalogsHotelItemResponse;
import org.openapitools.model.CatalogsRetailItemErrorResponse;
import org.openapitools.model.CatalogsRetailItemResponse;
import org.openapitools.model.ItemValidationEvent;
import org.openapitools.model.Pin;

@Canonical
class ItemResponse {
    
    CatalogsCreativeAssetsAttributes attributes

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
    /* The catalog item id in the merchant namespace */
    String itemId

    enum ItemResponseKindEnum {
    
        CREATIVE_ASSETS_ITEM_ERROR("creative_assets_item_error")
    
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
    /* The catalog hotel id in the merchant namespace */
    String hotelId
    /* The catalog creative assets id in the merchant namespace */
    String creativeAssetsId
    /* Array with the errors for the item id requested */
    List<ItemValidationEvent> errors = new ArrayList<>()
}
