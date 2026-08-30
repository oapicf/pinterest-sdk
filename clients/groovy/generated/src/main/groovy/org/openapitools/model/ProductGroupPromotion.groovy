package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CollectionsHeaderType;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.PreferredMediaType;
import org.openapitools.model.ProductGroupPromotionCustomizableCTAType;

@Canonical
class ProductGroupPromotion {
    /* ID of the ad group the product group belongs to. */
    String adGroupId
    /* The bid in micro currency. */
    Integer bidInMicroCurrency
    /* ID of the catalogs product group that this product group promotion references (required for create operations) */
    String catalogProductGroupId
    /* Catalogs product group name */
    String catalogProductGroupName
    
    CollectionsHeaderType collectionsHeaderType
    /* Collections Hero Destination Url */
    String collectionsHeroDestinationUrl
    /* Hero Pin ID if this PG is promoted as a Collection */
    String collectionsHeroPinId
    
    CreativeType creativeType
    
    ProductGroupPromotionCustomizableCTAType customizableCtaType
    /* The full product group definition path */
    String definition
    
    GridClickType gridClickType
    /* ID of the product group promotion (required for update operations). */
    String id
    /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    Boolean included
    /* Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. */
    Boolean isGenerateBackground
    /* Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. */
    Boolean isImageAutoResizing
    /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    Boolean isMdl
    /* The parent Product Group ID of this Product Group */
    String parentId
    
    PreferredMediaType preferredMediaType
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
