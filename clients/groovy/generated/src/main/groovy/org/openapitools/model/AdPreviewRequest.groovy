package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdPreviewShopping;
import org.openapitools.model.AdPreviewSourceImage;
import org.openapitools.model.AdPreviewSourcePinId;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.CustomizableCTAType;

@Canonical
class AdPreviewRequest {
    /* Image URL. */
    String imageUrl
    /* Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
    String promotionId
    /* Title displayed below ad. */
    String title
    /* Ad format of the shopping ad preview. */
    AdShoppingPreviewCreativeType creativeType
    /* Pin ID. */
    String pinId
    /* Catalog Product Group Id. */
    String catalogProductGroupId
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
    /* Preferred media type. */
    BasePreferredMediaType preferredMediaType
    /* Include promotion data in preview when available on catalog item. Defaults to false. */
    Boolean showPromotion
    /* Multi video template tag, image_tag and video_tag are mutual exclusive. */
    String videoTag
}
