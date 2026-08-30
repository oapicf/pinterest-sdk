package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionProductReportLevel._

case class ConversionProductReportLevel (
  
object ConversionProductReportLevel {
  import DateTimeCodecs._

  implicit val ConversionProductReportLevelCodecJson: CodecJson[ConversionProductReportLevel] = CodecJson.derive[ConversionProductReportLevel]
  implicit val ConversionProductReportLevelDecoder: EntityDecoder[ConversionProductReportLevel] = jsonOf[ConversionProductReportLevel]
  implicit val ConversionProductReportLevelEncoder: EntityEncoder[ConversionProductReportLevel] = jsonEncoderOf[ConversionProductReportLevel]
}
