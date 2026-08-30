package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PreferredMediaType._

case class PreferredMediaType (
  
object PreferredMediaType {
  import DateTimeCodecs._

  implicit val PreferredMediaTypeCodecJson: CodecJson[PreferredMediaType] = CodecJson.derive[PreferredMediaType]
  implicit val PreferredMediaTypeDecoder: EntityDecoder[PreferredMediaType] = jsonOf[PreferredMediaType]
  implicit val PreferredMediaTypeEncoder: EntityEncoder[PreferredMediaType] = jsonEncoderOf[PreferredMediaType]
}
