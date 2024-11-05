package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupPromotion._

case class ProductGroupPromotion (
  /* ID of the product group promotion. */
  id: Option[String],
/* ID of the ad group the product group belongs to. */
  adGroupId: Option[String],
/* The bid in micro currency. */
  bidInMicroCurrency: Option[Integer],
/* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
  included: Option[Boolean],
/* The full product group definition path */
  definition: Option[String],
/* The definition of the product group, relative to its parent - an attribute name/value pair */
  relativeDefinition: Option[String],
/* The parent Product Group ID of this Product Group */
  parentId: Option[String],
/* Slideshow Collections Title */
  slideshowCollectionsTitle: Option[String],
/* Slideshow Collections Description */
  slideshowCollectionsDescription: Option[String],
/* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
  isMdl: Option[Boolean],
status: Option[EntityStatus],
/* Tracking template for proudct group promotions. 4000 limit */
  trackingUrl: Option[String],
/* ID of the catalogs product group that this product group promotion references */
  catalogProductGroupId: Option[String],
/* Catalogs product group name */
  catalogProductGroupName: Option[String],
/* Hero Pin ID if this PG is promoted as a Collection */
  collectionsHeroPinId: Option[String],
/* Collections Hero Destination Url */
  collectionsHeroDestinationUrl: Option[String],
gridClickType: Option[GridClickType])

object ProductGroupPromotion {
  import DateTimeCodecs._

  implicit val ProductGroupPromotionCodecJson: CodecJson[ProductGroupPromotion] = CodecJson.derive[ProductGroupPromotion]
  implicit val ProductGroupPromotionDecoder: EntityDecoder[ProductGroupPromotion] = jsonOf[ProductGroupPromotion]
  implicit val ProductGroupPromotionEncoder: EntityEncoder[ProductGroupPromotion] = jsonEncoderOf[ProductGroupPromotion]
}
