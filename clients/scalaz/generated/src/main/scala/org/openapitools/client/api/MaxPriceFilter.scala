package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MaxPriceFilter._

case class MaxPriceFilter (
  MAX_PRICE: CatalogsProductGroupPricingCriteria)

object MaxPriceFilter {
  import DateTimeCodecs._

  implicit val MaxPriceFilterCodecJson: CodecJson[MaxPriceFilter] = CodecJson.derive[MaxPriceFilter]
  implicit val MaxPriceFilterDecoder: EntityDecoder[MaxPriceFilter] = jsonOf[MaxPriceFilter]
  implicit val MaxPriceFilterEncoder: EntityEncoder[MaxPriceFilter] = jsonEncoderOf[MaxPriceFilter]
}
