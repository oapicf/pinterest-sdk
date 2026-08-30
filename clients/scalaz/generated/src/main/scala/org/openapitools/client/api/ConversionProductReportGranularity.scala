package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionProductReportGranularity._

case class ConversionProductReportGranularity (
  
object ConversionProductReportGranularity {
  import DateTimeCodecs._

  implicit val ConversionProductReportGranularityCodecJson: CodecJson[ConversionProductReportGranularity] = CodecJson.derive[ConversionProductReportGranularity]
  implicit val ConversionProductReportGranularityDecoder: EntityDecoder[ConversionProductReportGranularity] = jsonOf[ConversionProductReportGranularity]
  implicit val ConversionProductReportGranularityEncoder: EntityEncoder[ConversionProductReportGranularity] = jsonEncoderOf[ConversionProductReportGranularity]
}
