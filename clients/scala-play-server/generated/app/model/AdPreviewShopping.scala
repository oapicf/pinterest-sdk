package model

import play.api.libs.json._

/**
  * Ad preview from a catalog product group (shopping).
  * @param catalogProductGroupId Catalog Product Group Id.
  * @param creativeType Ad format of the shopping ad preview.
  * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
  * @param heroImageTitle Title displayed below ad.
  * @param heroImageUrl Hero image URL.
  * @param heroPinId Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
  * @param imageTag Multi image template tag.
  * @param itemId Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
  * @param preferredMediaType Preferred media type.
  * @param showPromotion Include promotion data in preview when available on catalog item. Defaults to false.
  * @param videoTag Multi video template tag, image_tag and video_tag are mutual exclusive.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdPreviewShopping(
  catalogProductGroupId: String,
  creativeType: AdShoppingPreviewCreativeType,
  customizableCtaType: Option[CustomizableCTAType],
  heroImageTitle: Option[String],
  heroImageUrl: Option[String],
  heroPinId: Option[String],
  imageTag: Option[String],
  itemId: Option[String],
  preferredMediaType: Option[BasePreferredMediaType],
  showPromotion: Option[Boolean],
  videoTag: Option[String]
)

object AdPreviewShopping {
  implicit lazy val adPreviewShoppingJsonFormat: Format[AdPreviewShopping] = Json.format[AdPreviewShopping]
}

