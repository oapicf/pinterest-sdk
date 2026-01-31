package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotion._

case class ProductGroupPromotion (
  /* ID of the ad group the product group belongs to. */
  adGroupId: Option[String],
/* The bid in micro currency. */
  bidInMicroCurrency: Option[Integer],
/* ID of the catalogs product group that this product group promotion references */
  catalogProductGroupId: Option[String],
/* Catalogs product group name */
  catalogProductGroupName: Option[String],
/* Collections ad header type */
  collectionsHeaderType: Option[CollectionsHeaderType],
/* Collections Hero Destination Url */
  collectionsHeroDestinationUrl: Option[String],
/* Hero Pin ID if this PG is promoted as a Collection */
  collectionsHeroPinId: Option[String],
creativeType: Option[CreativeType],
/* Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE */
  customizableCtaType: Option[CustomizableCtaType],
/* The full product group definition path */
  definition: Option[String],
gridClickType: Option[GridClickType],
/* ID of the product group promotion. */
  id: Option[String],
/* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
  included: Option[Boolean],
/* Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. */
  isGenerateBackground: Option[Boolean],
/* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
  isMdl: Option[Boolean],
/* The parent Product Group ID of this Product Group */
  parentId: Option[String],
/* Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. */
  preferredMediaType: Option[PreferredMediaType],
/* The definition of the product group, relative to its parent - an attribute name/value pair */
  relativeDefinition: Option[String],
/* The ad image tag selected for the product group promotion. */
  selectedImageTag: Option[String],
/* The ad video tag selected for the product group promotion. */
  selectedVideoTag: Option[String],
/* Slideshow Collections Description */
  slideshowCollectionsDescription: Option[String],
/* Slideshow Collections Title */
  slideshowCollectionsTitle: Option[String],
status: Option[EntityStatus],
/* Tracking template for proudct group promotions. 4000 limit */
  trackingUrl: Option[String])

object ProductGroupPromotion {
  import DateTimeCodecs._
  sealed trait CollectionsHeaderType
  case object SHOPTHISCOLLECTION extends CollectionsHeaderType
  case object EXPLORETHISCOLLECTION extends CollectionsHeaderType
  case object NOHEADER extends CollectionsHeaderType
  case object ONSALE extends CollectionsHeaderType
  case object GETDEAL extends CollectionsHeaderType

  object CollectionsHeaderType {
    def toCollectionsHeaderType(s: String): Option[CollectionsHeaderType] = s match {
      case "SHOPTHISCOLLECTION" => Some(SHOPTHISCOLLECTION)
      case "EXPLORETHISCOLLECTION" => Some(EXPLORETHISCOLLECTION)
      case "NOHEADER" => Some(NOHEADER)
      case "ONSALE" => Some(ONSALE)
      case "GETDEAL" => Some(GETDEAL)
      case _ => None
    }

    def fromCollectionsHeaderType(x: CollectionsHeaderType): String = x match {
      case SHOPTHISCOLLECTION => "SHOPTHISCOLLECTION"
      case EXPLORETHISCOLLECTION => "EXPLORETHISCOLLECTION"
      case NOHEADER => "NOHEADER"
      case ONSALE => "ONSALE"
      case GETDEAL => "GETDEAL"
    }
  }

  implicit val CollectionsHeaderTypeEnumEncoder: EncodeJson[CollectionsHeaderType] =
    EncodeJson[CollectionsHeaderType](is => StringEncodeJson(CollectionsHeaderType.fromCollectionsHeaderType(is)))

  implicit val CollectionsHeaderTypeEnumDecoder: DecodeJson[CollectionsHeaderType] =
    DecodeJson.optionDecoder[CollectionsHeaderType](n => n.string.flatMap(jStr => CollectionsHeaderType.toCollectionsHeaderType(jStr)), "CollectionsHeaderType failed to de-serialize")
  sealed trait CustomizableCtaType
  case object SHOPNOW extends CustomizableCtaType
  case object BOOKNOW extends CustomizableCtaType
  case object ONSALE extends CustomizableCtaType
  case object GETDEAL extends CustomizableCtaType
  case object BUYONLINEPICKUPINSTORE extends CustomizableCtaType

  object CustomizableCtaType {
    def toCustomizableCtaType(s: String): Option[CustomizableCtaType] = s match {
      case "SHOPNOW" => Some(SHOPNOW)
      case "BOOKNOW" => Some(BOOKNOW)
      case "ONSALE" => Some(ONSALE)
      case "GETDEAL" => Some(GETDEAL)
      case "BUYONLINEPICKUPINSTORE" => Some(BUYONLINEPICKUPINSTORE)
      case _ => None
    }

    def fromCustomizableCtaType(x: CustomizableCtaType): String = x match {
      case SHOPNOW => "SHOPNOW"
      case BOOKNOW => "BOOKNOW"
      case ONSALE => "ONSALE"
      case GETDEAL => "GETDEAL"
      case BUYONLINEPICKUPINSTORE => "BUYONLINEPICKUPINSTORE"
    }
  }

  implicit val CustomizableCtaTypeEnumEncoder: EncodeJson[CustomizableCtaType] =
    EncodeJson[CustomizableCtaType](is => StringEncodeJson(CustomizableCtaType.fromCustomizableCtaType(is)))

  implicit val CustomizableCtaTypeEnumDecoder: DecodeJson[CustomizableCtaType] =
    DecodeJson.optionDecoder[CustomizableCtaType](n => n.string.flatMap(jStr => CustomizableCtaType.toCustomizableCtaType(jStr)), "CustomizableCtaType failed to de-serialize")
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

  implicit val ProductGroupPromotionCodecJson: CodecJson[ProductGroupPromotion] = CodecJson.derive[ProductGroupPromotion]
  implicit val ProductGroupPromotionDecoder: EntityDecoder[ProductGroupPromotion] = jsonOf[ProductGroupPromotion]
  implicit val ProductGroupPromotionEncoder: EntityEncoder[ProductGroupPromotion] = jsonEncoderOf[ProductGroupPromotion]
}
