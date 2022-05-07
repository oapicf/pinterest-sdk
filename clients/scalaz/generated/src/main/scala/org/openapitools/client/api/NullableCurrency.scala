package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullableCurrency._

case class NullableCurrency (
  
object NullableCurrency {
  import DateTimeCodecs._

  implicit val NullableCurrencyCodecJson: CodecJson[NullableCurrency] = CodecJson.derive[NullableCurrency]
  implicit val NullableCurrencyDecoder: EntityDecoder[NullableCurrency] = jsonOf[NullableCurrency]
  implicit val NullableCurrencyEncoder: EntityEncoder[NullableCurrency] = jsonEncoderOf[NullableCurrency]
}
