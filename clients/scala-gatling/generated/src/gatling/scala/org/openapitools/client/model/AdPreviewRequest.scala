
package org.openapitools.client.model


case class AdPreviewRequest (
    /* Image URL. */
    _imageUrl: String,
    /* Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
    _promotionId: Option[String],
    /* Title displayed below ad. */
    _title: String,
    /* Ad format of the shopping ad preview. */
    _creativeType: AdShoppingPreviewCreativeType,
    /* Pin ID. */
    _pinId: String,
    /* Catalog Product Group Id. */
    _catalogProductGroupId: String,
    /* Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE` */
    _customizableCtaType: Option[CustomizableCTAType],
    /* Title displayed below ad. */
    _heroImageTitle: Option[String],
    /* Hero image URL. */
    _heroImageUrl: Option[String],
    /* Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. */
    _heroPinId: Option[String],
    /* Multi image template tag. */
    _imageTag: Option[String],
    /* Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. */
    _itemId: Option[String],
    /* Preferred media type. */
    _preferredMediaType: Option[BasePreferredMediaType],
    /* Include promotion data in preview when available on catalog item. Defaults to false. */
    _showPromotion: Option[Boolean],
    /* Multi video template tag, image_tag and video_tag are mutual exclusive. */
    _videoTag: Option[String]
)
object AdPreviewRequest {
    def toStringBody(var_imageUrl: Object, var_promotionId: Object, var_title: Object, var_creativeType: Object, var_pinId: Object, var_catalogProductGroupId: Object, var_customizableCtaType: Object, var_heroImageTitle: Object, var_heroImageUrl: Object, var_heroPinId: Object, var_imageTag: Object, var_itemId: Object, var_preferredMediaType: Object, var_showPromotion: Object, var_videoTag: Object) =
        s"""
        | {
        | "imageUrl":$var_imageUrl,"promotionId":$var_promotionId,"title":$var_title,"creativeType":$var_creativeType,"pinId":$var_pinId,"catalogProductGroupId":$var_catalogProductGroupId,"customizableCtaType":$var_customizableCtaType,"heroImageTitle":$var_heroImageTitle,"heroImageUrl":$var_heroImageUrl,"heroPinId":$var_heroPinId,"imageTag":$var_imageTag,"itemId":$var_itemId,"preferredMediaType":$var_preferredMediaType,"showPromotion":$var_showPromotion,"videoTag":$var_videoTag
        | }
        """.stripMargin
}
