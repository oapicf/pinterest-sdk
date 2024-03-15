package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedsCreateRequestDefaultLocale._

case class CatalogsFeedsCreateRequestDefaultLocale (
  
object CatalogsFeedsCreateRequestDefaultLocale {
  import DateTimeCodecs._

  implicit val CatalogsFeedsCreateRequestDefaultLocaleCodecJson: CodecJson[CatalogsFeedsCreateRequestDefaultLocale] = CodecJson.derive[CatalogsFeedsCreateRequestDefaultLocale]
  implicit val CatalogsFeedsCreateRequestDefaultLocaleDecoder: EntityDecoder[CatalogsFeedsCreateRequestDefaultLocale] = jsonOf[CatalogsFeedsCreateRequestDefaultLocale]
  implicit val CatalogsFeedsCreateRequestDefaultLocaleEncoder: EntityEncoder[CatalogsFeedsCreateRequestDefaultLocale] = jsonEncoderOf[CatalogsFeedsCreateRequestDefaultLocale]
}
