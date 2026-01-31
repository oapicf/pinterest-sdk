package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewShopping._

case class AdPreviewShopping (
  /* Catalog Product Group Id. */
  catalogProductGroupId: String,
/* Ad format of the shopping ad preview. */
  creativeType: CreativeType,
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
  preferredMediaType: Option[PreferredMediaType],
/* Multi video template tag, image_tag and video_tag are mutual exclusive. */
  videoTag: Option[String])

object AdPreviewShopping {
  import DateTimeCodecs._
  sealed trait CreativeType
  case object SHOPPING extends CreativeType
  case object CAROUSEL extends CreativeType
  case object COLLECTION extends CreativeType
  case object REGULAR extends CreativeType

  object CreativeType {
    def toCreativeType(s: String): Option[CreativeType] = s match {
      case "SHOPPING" => Some(SHOPPING)
      case "CAROUSEL" => Some(CAROUSEL)
      case "COLLECTION" => Some(COLLECTION)
      case "REGULAR" => Some(REGULAR)
      case _ => None
    }

    def fromCreativeType(x: CreativeType): String = x match {
      case SHOPPING => "SHOPPING"
      case CAROUSEL => "CAROUSEL"
      case COLLECTION => "COLLECTION"
      case REGULAR => "REGULAR"
    }
  }

  implicit val CreativeTypeEnumEncoder: EncodeJson[CreativeType] =
    EncodeJson[CreativeType](is => StringEncodeJson(CreativeType.fromCreativeType(is)))

  implicit val CreativeTypeEnumDecoder: DecodeJson[CreativeType] =
    DecodeJson.optionDecoder[CreativeType](n => n.string.flatMap(jStr => CreativeType.toCreativeType(jStr)), "CreativeType failed to de-serialize")
  sealed trait PreferredMediaType
  case object VIDEO extends PreferredMediaType
  case object IMAGE extends PreferredMediaType

  object PreferredMediaType {
    def toPreferredMediaType(s: String): Option[PreferredMediaType] = s match {
      case "VIDEO" => Some(VIDEO)
      case "IMAGE" => Some(IMAGE)
      case _ => None
    }

    def fromPreferredMediaType(x: PreferredMediaType): String = x match {
      case VIDEO => "VIDEO"
      case IMAGE => "IMAGE"
    }
  }

  implicit val PreferredMediaTypeEnumEncoder: EncodeJson[PreferredMediaType] =
    EncodeJson[PreferredMediaType](is => StringEncodeJson(PreferredMediaType.fromPreferredMediaType(is)))

  implicit val PreferredMediaTypeEnumDecoder: DecodeJson[PreferredMediaType] =
    DecodeJson.optionDecoder[PreferredMediaType](n => n.string.flatMap(jStr => PreferredMediaType.toPreferredMediaType(jStr)), "PreferredMediaType failed to de-serialize")

  implicit val AdPreviewShoppingCodecJson: CodecJson[AdPreviewShopping] = CodecJson.derive[AdPreviewShopping]
  implicit val AdPreviewShoppingDecoder: EntityDecoder[AdPreviewShopping] = jsonOf[AdPreviewShopping]
  implicit val AdPreviewShoppingEncoder: EntityEncoder[AdPreviewShopping] = jsonEncoderOf[AdPreviewShopping]
}
