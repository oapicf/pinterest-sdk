package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailProductMetadata._

case class CatalogsRetailProductMetadata (
  availability: ProductAvailability,
currency: NonNullableCatalogsCurrency,
/* The parent ID of the product. */
  itemGroupId: String,
/* The user-created unique ID that represents the product. */
  itemId: String,
/* The price of the product. */
  price: BigDecimal,
/* The discounted price of the product. */
  salePrice: BigDecimal)

object CatalogsRetailProductMetadata {
  import DateTimeCodecs._

  implicit val CatalogsRetailProductMetadataCodecJson: CodecJson[CatalogsRetailProductMetadata] = CodecJson.derive[CatalogsRetailProductMetadata]
  implicit val CatalogsRetailProductMetadataDecoder: EntityDecoder[CatalogsRetailProductMetadata] = jsonOf[CatalogsRetailProductMetadata]
  implicit val CatalogsRetailProductMetadataEncoder: EntityEncoder[CatalogsRetailProductMetadata] = jsonEncoderOf[CatalogsRetailProductMetadata]
}
