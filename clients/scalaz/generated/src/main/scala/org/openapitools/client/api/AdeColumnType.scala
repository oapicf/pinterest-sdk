package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdeColumnType._

case class AdeColumnType (
  
object AdeColumnType {
  import DateTimeCodecs._

  implicit val AdeColumnTypeCodecJson: CodecJson[AdeColumnType] = CodecJson.derive[AdeColumnType]
  implicit val AdeColumnTypeDecoder: EntityDecoder[AdeColumnType] = jsonOf[AdeColumnType]
  implicit val AdeColumnTypeEncoder: EntityEncoder[AdeColumnType] = jsonEncoderOf[AdeColumnType]
}
