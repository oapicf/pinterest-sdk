package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEvents._

case class ConversionEvents (
  data: List[ConversionEventsDataInner])

object ConversionEvents {
  import DateTimeCodecs._

  implicit val ConversionEventsCodecJson: CodecJson[ConversionEvents] = CodecJson.derive[ConversionEvents]
  implicit val ConversionEventsDecoder: EntityDecoder[ConversionEvents] = jsonOf[ConversionEvents]
  implicit val ConversionEventsEncoder: EntityEncoder[ConversionEvents] = jsonEncoderOf[ConversionEvents]
}
