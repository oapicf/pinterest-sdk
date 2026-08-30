package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewRequest._

case class AdPreviewRequest (
  /* Image URL. */
  imageUrl: String,
/* Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
  promotionId: Option[String],
/* Title displayed below ad. */
  title: String,
/* Ad format of the shopping ad preview. */
  creativeType: AdShoppingPreviewCreativeType,
/* Pin ID. */
  pinId: String,
/* Catalog Product Group Id. */
  catalogProductGroupId: String,
/* Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE` */
  customizableCtaType: Option[CustomizableCTAType],
/* Title displayed below ad. */
  heroImageTitle: Option[String],
/* Hero image URL. */
  heroImageUrl: Option[String],
/* Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. */
  heroPinId: Option[String],
/* Multi image template tag. */
  imageTag: Option[String],
/* Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. */
  itemId: Option[String],
/* Preferred media type. */
  preferredMediaType: Option[BasePreferredMediaType],
/* Include promotion data in preview when available on catalog item. Defaults to false. */
  showPromotion: Option[Boolean],
/* Multi video template tag, image_tag and video_tag are mutual exclusive. */
  videoTag: Option[String])

object AdPreviewRequest {
  import DateTimeCodecs._

  implicit val AdPreviewRequestCodecJson: CodecJson[AdPreviewRequest] = CodecJson.derive[AdPreviewRequest]
  implicit val AdPreviewRequestDecoder: EntityDecoder[AdPreviewRequest] = jsonOf[AdPreviewRequest]
  implicit val AdPreviewRequestEncoder: EntityEncoder[AdPreviewRequest] = jsonEncoderOf[AdPreviewRequest]
}
