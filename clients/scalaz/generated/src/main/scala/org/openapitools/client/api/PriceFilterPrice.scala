package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceFilterPrice._

case class PriceFilterPrice (
  currency: NonNullableCatalogsCurrency,
negated: Option[Boolean],
operator: NumericFilterOperatorType,
value: BigDecimal)

object PriceFilterPrice {
  import DateTimeCodecs._

  implicit val PriceFilterPriceCodecJson: CodecJson[PriceFilterPrice] = CodecJson.derive[PriceFilterPrice]
  implicit val PriceFilterPriceDecoder: EntityDecoder[PriceFilterPrice] = jsonOf[PriceFilterPrice]
  implicit val PriceFilterPriceEncoder: EntityEncoder[PriceFilterPrice] = jsonEncoderOf[PriceFilterPrice]
}
