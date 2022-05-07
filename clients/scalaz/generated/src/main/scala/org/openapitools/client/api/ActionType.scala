package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ActionType._

case class ActionType (
  
object ActionType {
  import DateTimeCodecs._

  implicit val ActionTypeCodecJson: CodecJson[ActionType] = CodecJson.derive[ActionType]
  implicit val ActionTypeDecoder: EntityDecoder[ActionType] = jsonOf[ActionType]
  implicit val ActionTypeEncoder: EntityEncoder[ActionType] = jsonEncoderOf[ActionType]
}
