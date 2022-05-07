package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NonNullableCatalogsCurrency._

case class NonNullableCatalogsCurrency (
  
object NonNullableCatalogsCurrency {
  import DateTimeCodecs._

  implicit val NonNullableCatalogsCurrencyCodecJson: CodecJson[NonNullableCatalogsCurrency] = CodecJson.derive[NonNullableCatalogsCurrency]
  implicit val NonNullableCatalogsCurrencyDecoder: EntityDecoder[NonNullableCatalogsCurrency] = jsonOf[NonNullableCatalogsCurrency]
  implicit val NonNullableCatalogsCurrencyEncoder: EntityEncoder[NonNullableCatalogsCurrency] = jsonEncoderOf[NonNullableCatalogsCurrency]
}
