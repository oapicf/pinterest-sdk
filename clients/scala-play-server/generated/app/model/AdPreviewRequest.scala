package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewRequest.
  * @param imageUrl Image URL.
  * @param promotionId Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  * @param title Title displayed below ad.
  * @param creativeType Ad format of the shopping ad preview.
  * @param pinId Pin ID.
  * @param catalogProductGroupId Catalog Product Group Id.
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
case class AdPreviewRequest(
  imageUrl: String,
  promotionId: Option[String],
  title: String,
  creativeType: AdShoppingPreviewCreativeType,
  pinId: String,
  catalogProductGroupId: String,
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

object AdPreviewRequest {
  implicit lazy val adPreviewRequestJsonFormat: Format[AdPreviewRequest] = Json.format[AdPreviewRequest]
}

