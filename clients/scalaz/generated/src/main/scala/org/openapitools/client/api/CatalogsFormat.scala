package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFormat._

case class CatalogsFormat (
  
object CatalogsFormat {
  import DateTimeCodecs._

  implicit val CatalogsFormatCodecJson: CodecJson[CatalogsFormat] = CodecJson.derive[CatalogsFormat]
  implicit val CatalogsFormatDecoder: EntityDecoder[CatalogsFormat] = jsonOf[CatalogsFormat]
  implicit val CatalogsFormatEncoder: EntityEncoder[CatalogsFormat] = jsonEncoderOf[CatalogsFormat]
}
