package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionProductReportingColumn._

case class ConversionProductReportingColumn (
  
object ConversionProductReportingColumn {
  import DateTimeCodecs._

  implicit val ConversionProductReportingColumnCodecJson: CodecJson[ConversionProductReportingColumn] = CodecJson.derive[ConversionProductReportingColumn]
  implicit val ConversionProductReportingColumnDecoder: EntityDecoder[ConversionProductReportingColumn] = jsonOf[ConversionProductReportingColumn]
  implicit val ConversionProductReportingColumnEncoder: EntityEncoder[ConversionProductReportingColumn] = jsonEncoderOf[ConversionProductReportingColumn]
}
