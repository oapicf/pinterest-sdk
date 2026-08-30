package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionProductReportBreakdownType._

case class ConversionProductReportBreakdownType (
  
object ConversionProductReportBreakdownType {
  import DateTimeCodecs._

  implicit val ConversionProductReportBreakdownTypeCodecJson: CodecJson[ConversionProductReportBreakdownType] = CodecJson.derive[ConversionProductReportBreakdownType]
  implicit val ConversionProductReportBreakdownTypeDecoder: EntityDecoder[ConversionProductReportBreakdownType] = jsonOf[ConversionProductReportBreakdownType]
  implicit val ConversionProductReportBreakdownTypeEncoder: EntityEncoder[ConversionProductReportBreakdownType] = jsonEncoderOf[ConversionProductReportBreakdownType]
}
