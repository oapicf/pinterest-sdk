
package org.openapitools.client.model


case class AdPreviewShopping (
    /* Catalog Product Group Id. */
    _catalogProductGroupId: String,
    /* Ad format of the shopping ad preview. */
    _creativeType: AdShoppingPreviewCreativeType,
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
object AdPreviewShopping {
    def toStringBody(var_catalogProductGroupId: Object, var_creativeType: Object, var_customizableCtaType: Object, var_heroImageTitle: Object, var_heroImageUrl: Object, var_heroPinId: Object, var_imageTag: Object, var_itemId: Object, var_preferredMediaType: Object, var_showPromotion: Object, var_videoTag: Object) =
        s"""
        | {
        | "catalogProductGroupId":$var_catalogProductGroupId,"creativeType":$var_creativeType,"customizableCtaType":$var_customizableCtaType,"heroImageTitle":$var_heroImageTitle,"heroImageUrl":$var_heroImageUrl,"heroPinId":$var_heroPinId,"imageTag":$var_imageTag,"itemId":$var_itemId,"preferredMediaType":$var_preferredMediaType,"showPromotion":$var_showPromotion,"videoTag":$var_videoTag
        | }
        """.stripMargin
}
