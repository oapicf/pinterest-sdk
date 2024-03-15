package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsLocale._

case class CatalogsLocale (
  
object CatalogsLocale {
  import DateTimeCodecs._

  implicit val CatalogsLocaleCodecJson: CodecJson[CatalogsLocale] = CodecJson.derive[CatalogsLocale]
  implicit val CatalogsLocaleDecoder: EntityDecoder[CatalogsLocale] = jsonOf[CatalogsLocale]
  implicit val CatalogsLocaleEncoder: EntityEncoder[CatalogsLocale] = jsonEncoderOf[CatalogsLocale]
}
