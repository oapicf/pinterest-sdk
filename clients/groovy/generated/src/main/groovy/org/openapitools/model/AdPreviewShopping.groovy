package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CustomizableCTAType;

@Canonical
class AdPreviewShopping {
    /* Catalog Product Group Id. */
    String catalogProductGroupId

    enum CreativeTypeEnum {
    
        SHOPPING("SHOPPING"),
        
        CAROUSEL("CAROUSEL"),
        
        COLLECTION("COLLECTION"),
        
        REGULAR("REGULAR")
    
        private final String value
    
        CreativeTypeEnum(String value) {
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

    /* Ad format of the shopping ad preview. */
    CreativeTypeEnum creativeType
    /* Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE` */
    CustomizableCTAType customizableCtaType
    /* Title displayed below ad. */
    String heroImageTitle
    /* Hero image URL. */
    String heroImageUrl
    /* Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. */
    String heroPinId
    /* Multi image template tag. */
    String imageTag
    /* Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. */
    String itemId

    enum PreferredMediaTypeEnum {
    
        VIDEO("VIDEO"),
        
        IMAGE("IMAGE")
    
        private final String value
    
        PreferredMediaTypeEnum(String value) {
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

    /* Preferred media type. */
    PreferredMediaTypeEnum preferredMediaType
    /* Multi video template tag, image_tag and video_tag are mutual exclusive. */
    String videoTag
}
