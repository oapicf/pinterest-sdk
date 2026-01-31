package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;

@Canonical
class ProductGroupPromotion {
    /* ID of the ad group the product group belongs to. */
    String adGroupId
    /* The bid in micro currency. */
    Integer bidInMicroCurrency
    /* ID of the catalogs product group that this product group promotion references */
    String catalogProductGroupId
    /* Catalogs product group name */
    String catalogProductGroupName

    enum CollectionsHeaderTypeEnum {
    
        SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
        
        EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
        
        NO_HEADER("NO_HEADER"),
        
        ON_SALE("ON_SALE"),
        
        GET_DEAL("GET_DEAL")
    
        private final String value
    
        CollectionsHeaderTypeEnum(String value) {
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

    /* Collections ad header type */
    CollectionsHeaderTypeEnum collectionsHeaderType
    /* Collections Hero Destination Url */
    String collectionsHeroDestinationUrl
    /* Hero Pin ID if this PG is promoted as a Collection */
    String collectionsHeroPinId
    
    CreativeType creativeType

    enum CustomizableCtaTypeEnum {
    
        SHOP_NOW("SHOP_NOW"),
        
        BOOK_NOW("BOOK_NOW"),
        
        ON_SALE("ON_SALE"),
        
        GET_DEAL("GET_DEAL"),
        
        BUY_ONLINE_PICKUP_IN_STORE("BUY_ONLINE_PICKUP_IN_STORE")
    
        private final String value
    
        CustomizableCtaTypeEnum(String value) {
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

    /* Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE */
    CustomizableCtaTypeEnum customizableCtaType
    /* The full product group definition path */
    String definition
    
    GridClickType gridClickType
    /* ID of the product group promotion. */
    String id
    /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    Boolean included
    /* Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. */
    Boolean isGenerateBackground
    /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    Boolean isMdl
    /* The parent Product Group ID of this Product Group */
    String parentId

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

    /* Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. */
    PreferredMediaTypeEnum preferredMediaType
    /* The definition of the product group, relative to its parent - an attribute name/value pair */
    String relativeDefinition
    /* The ad image tag selected for the product group promotion. */
    String selectedImageTag
    /* The ad video tag selected for the product group promotion. */
    String selectedVideoTag
    /* Slideshow Collections Description */
    String slideshowCollectionsDescription
    /* Slideshow Collections Title */
    String slideshowCollectionsTitle
    
    EntityStatus status
    /* Tracking template for proudct group promotions. 4000 limit */
    String trackingUrl
}
