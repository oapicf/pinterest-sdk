package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionAttributionWindowDays._

case class ConversionAttributionWindowDays (
  
object ConversionAttributionWindowDays {
  import DateTimeCodecs._

  implicit val ConversionAttributionWindowDaysCodecJson: CodecJson[ConversionAttributionWindowDays] = CodecJson.derive[ConversionAttributionWindowDays]
  implicit val ConversionAttributionWindowDaysDecoder: EntityDecoder[ConversionAttributionWindowDays] = jsonOf[ConversionAttributionWindowDays]
  implicit val ConversionAttributionWindowDaysEncoder: EntityEncoder[ConversionAttributionWindowDays] = jsonEncoderOf[ConversionAttributionWindowDays]
}
