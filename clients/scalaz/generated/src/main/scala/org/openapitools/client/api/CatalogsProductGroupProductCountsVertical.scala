package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupProductCountsVertical._

case class CatalogsProductGroupProductCountsVertical (
  catalogType: CatalogsType,
inStock: BigDecimal,
outOfStock: BigDecimal,
preorder: BigDecimal,
total: BigDecimal,
videos: BigDecimal)

object CatalogsProductGroupProductCountsVertical {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupProductCountsVerticalCodecJson: CodecJson[CatalogsProductGroupProductCountsVertical] = CodecJson.derive[CatalogsProductGroupProductCountsVertical]
  implicit val CatalogsProductGroupProductCountsVerticalDecoder: EntityDecoder[CatalogsProductGroupProductCountsVertical] = jsonOf[CatalogsProductGroupProductCountsVertical]
  implicit val CatalogsProductGroupProductCountsVerticalEncoder: EntityEncoder[CatalogsProductGroupProductCountsVertical] = jsonEncoderOf[CatalogsProductGroupProductCountsVertical]
}
