package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEvent._

case class ConversionEvent (
  
object ConversionEvent {
  import DateTimeCodecs._

  implicit val ConversionEventCodecJson: CodecJson[ConversionEvent] = CodecJson.derive[ConversionEvent]
  implicit val ConversionEventDecoder: EntityDecoder[ConversionEvent] = jsonOf[ConversionEvent]
  implicit val ConversionEventEncoder: EntityEncoder[ConversionEvent] = jsonEncoderOf[ConversionEvent]
}
