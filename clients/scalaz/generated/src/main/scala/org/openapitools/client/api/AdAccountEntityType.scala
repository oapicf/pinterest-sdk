package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountEntityType._

case class AdAccountEntityType (
  
object AdAccountEntityType {
  import DateTimeCodecs._

  implicit val AdAccountEntityTypeCodecJson: CodecJson[AdAccountEntityType] = CodecJson.derive[AdAccountEntityType]
  implicit val AdAccountEntityTypeDecoder: EntityDecoder[AdAccountEntityType] = jsonOf[AdAccountEntityType]
  implicit val AdAccountEntityTypeEncoder: EntityEncoder[AdAccountEntityType] = jsonEncoderOf[AdAccountEntityType]
}
