package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupProductCounts._

case class CatalogsProductGroupProductCounts (
  inStock: BigDecimal,
outOfStock: BigDecimal,
preorder: BigDecimal,
total: BigDecimal)

object CatalogsProductGroupProductCounts {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupProductCountsCodecJson: CodecJson[CatalogsProductGroupProductCounts] = CodecJson.derive[CatalogsProductGroupProductCounts]
  implicit val CatalogsProductGroupProductCountsDecoder: EntityDecoder[CatalogsProductGroupProductCounts] = jsonOf[CatalogsProductGroupProductCounts]
  implicit val CatalogsProductGroupProductCountsEncoder: EntityEncoder[CatalogsProductGroupProductCounts] = jsonEncoderOf[CatalogsProductGroupProductCounts]
}
