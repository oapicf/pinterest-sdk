package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductMetadata._

case class CatalogsProductMetadata (
  /* The user-created unique ID that represents the product. */
  itemId: String,
/* The parent ID of the product. */
  itemGroupId: String,
availability: NonNullableProductAvailabilityType,
/* The price of the product. */
  price: BigDecimal,
/* The discounted price of the product. */
  salePrice: BigDecimal,
currency: NonNullableCatalogsCurrency)

object CatalogsProductMetadata {
  import DateTimeCodecs._

  implicit val CatalogsProductMetadataCodecJson: CodecJson[CatalogsProductMetadata] = CodecJson.derive[CatalogsProductMetadata]
  implicit val CatalogsProductMetadataDecoder: EntityDecoder[CatalogsProductMetadata] = jsonOf[CatalogsProductMetadata]
  implicit val CatalogsProductMetadataEncoder: EntityEncoder[CatalogsProductMetadata] = jsonEncoderOf[CatalogsProductMetadata]
}
