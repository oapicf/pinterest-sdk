package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinType._

case class PinType (
  
object PinType {
  import DateTimeCodecs._

  implicit val PinTypeCodecJson: CodecJson[PinType] = CodecJson.derive[PinType]
  implicit val PinTypeDecoder: EntityDecoder[PinType] = jsonOf[PinType]
  implicit val PinTypeEncoder: EntityEncoder[PinType] = jsonEncoderOf[PinType]
}
