package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;

@Canonical
class ProductGroupPromotionResponseElement {
    /* ID of the product group promotion. */
    String id
    /* ID of the ad group the product group belongs to. */
    String adGroupId
    /* The bid in micro currency. */
    Integer bidInMicroCurrency
    /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    Boolean included
    /* The full product group definition path */
    String definition
    /* The definition of the product group, relative to its parent - an attribute name/value pair */
    String relativeDefinition
    /* The parent Product Group ID of this Product Group */
    String parentId
    /* Slideshow Collections Title */
    String slideshowCollectionsTitle
    /* Slideshow Collections Description */
    String slideshowCollectionsDescription
    /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    Boolean isMdl
    
    EntityStatus status
    /* Tracking template for proudct group promotions. 4000 limit */
    String trackingUrl
    /* ID of the catalogs product group that this product group promotion references */
    String catalogProductGroupId
    /* Catalogs product group name */
    String catalogProductGroupName
    /* Hero Pin ID if this PG is promoted as a Collection */
    String collectionsHeroPinId
    /* Collections Hero Destination Url */
    String collectionsHeroDestinationUrl
    
    GridClickType gridClickType
    
    CreativeType creativeType
}
