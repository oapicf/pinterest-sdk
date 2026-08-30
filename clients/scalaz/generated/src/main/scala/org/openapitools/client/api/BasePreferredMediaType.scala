package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BasePreferredMediaType._

case class BasePreferredMediaType (
  
object BasePreferredMediaType {
  import DateTimeCodecs._

  implicit val BasePreferredMediaTypeCodecJson: CodecJson[BasePreferredMediaType] = CodecJson.derive[BasePreferredMediaType]
  implicit val BasePreferredMediaTypeDecoder: EntityDecoder[BasePreferredMediaType] = jsonOf[BasePreferredMediaType]
  implicit val BasePreferredMediaTypeEncoder: EntityEncoder[BasePreferredMediaType] = jsonEncoderOf[BasePreferredMediaType]
}
