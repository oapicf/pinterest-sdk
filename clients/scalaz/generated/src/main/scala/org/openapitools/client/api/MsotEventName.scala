package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MsotEventName._

case class MsotEventName (
  
object MsotEventName {
  import DateTimeCodecs._

  implicit val MsotEventNameCodecJson: CodecJson[MsotEventName] = CodecJson.derive[MsotEventName]
  implicit val MsotEventNameDecoder: EntityDecoder[MsotEventName] = jsonOf[MsotEventName]
  implicit val MsotEventNameEncoder: EntityEncoder[MsotEventName] = jsonEncoderOf[MsotEventName]
}
