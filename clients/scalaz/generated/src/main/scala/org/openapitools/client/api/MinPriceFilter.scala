package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MinPriceFilter._

case class MinPriceFilter (
  MIN_PRICE: CatalogsProductGroupPricingCriteria)

object MinPriceFilter {
  import DateTimeCodecs._

  implicit val MinPriceFilterCodecJson: CodecJson[MinPriceFilter] = CodecJson.derive[MinPriceFilter]
  implicit val MinPriceFilterDecoder: EntityDecoder[MinPriceFilter] = jsonOf[MinPriceFilter]
  implicit val MinPriceFilterEncoder: EntityEncoder[MinPriceFilter] = jsonEncoderOf[MinPriceFilter]
}
