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
/* ID of the catalogs product group that this product group promotion references (required for create operations) */
  catalogProductGroupId: Option[String],
/* Catalogs product group name */
  catalogProductGroupName: Option[String],
collectionsHeaderType: Option[CollectionsHeaderType],
/* Collections Hero Destination Url */
  collectionsHeroDestinationUrl: Option[String],
/* Hero Pin ID if this PG is promoted as a Collection */
  collectionsHeroPinId: Option[String],
creativeType: Option[CreativeType],
customizableCtaType: Option[ProductGroupPromotionCustomizableCTAType],
/* The full product group definition path */
  definition: Option[String],
gridClickType: Option[GridClickType],
/* ID of the product group promotion (required for update operations). */
  id: Option[String],
/* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
  included: Option[Boolean],
/* Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. */
  isGenerateBackground: Option[Boolean],
/* Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. */
  isImageAutoResizing: Option[Boolean],
/* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
  isMdl: Option[Boolean],
/* The parent Product Group ID of this Product Group */
  parentId: Option[String],
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

  implicit val ProductGroupPromotionCodecJson: CodecJson[ProductGroupPromotion] = CodecJson.derive[ProductGroupPromotion]
  implicit val ProductGroupPromotionDecoder: EntityDecoder[ProductGroupPromotion] = jsonOf[ProductGroupPromotion]
  implicit val ProductGroupPromotionEncoder: EntityEncoder[ProductGroupPromotion] = jsonEncoderOf[ProductGroupPromotion]
}
