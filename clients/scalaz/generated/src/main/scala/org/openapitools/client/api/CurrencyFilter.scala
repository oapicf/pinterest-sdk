package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CurrencyFilter._

case class CurrencyFilter (
  CURRENCY: CatalogsProductGroupCurrencyCriteria)

object CurrencyFilter {
  import DateTimeCodecs._

  implicit val CurrencyFilterCodecJson: CodecJson[CurrencyFilter] = CodecJson.derive[CurrencyFilter]
  implicit val CurrencyFilterDecoder: EntityDecoder[CurrencyFilter] = jsonOf[CurrencyFilter]
  implicit val CurrencyFilterEncoder: EntityEncoder[CurrencyFilter] = jsonEncoderOf[CurrencyFilter]
}
