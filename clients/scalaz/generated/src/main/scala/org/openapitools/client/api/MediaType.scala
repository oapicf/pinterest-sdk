package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaType._

case class MediaType (
  
object MediaType {
  import DateTimeCodecs._

  implicit val MediaTypeCodecJson: CodecJson[MediaType] = CodecJson.derive[MediaType]
  implicit val MediaTypeDecoder: EntityDecoder[MediaType] = jsonOf[MediaType]
  implicit val MediaTypeEncoder: EntityEncoder[MediaType] = jsonEncoderOf[MediaType]
}
