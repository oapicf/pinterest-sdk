package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.Pin;

@Canonical
class CatalogsCreativeAssetsItemResponse {
    
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
    /* The catalog creative assets id in the merchant namespace */
    String creativeAssetsId

    enum ItemResponseKindEnum {
    
        CREATIVE_ASSETS_ITEM("creative_assets_item")
    
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
