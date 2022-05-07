package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionReportAttributionType._

case class ConversionReportAttributionType (
  
object ConversionReportAttributionType {
  import DateTimeCodecs._

  implicit val ConversionReportAttributionTypeCodecJson: CodecJson[ConversionReportAttributionType] = CodecJson.derive[ConversionReportAttributionType]
  implicit val ConversionReportAttributionTypeDecoder: EntityDecoder[ConversionReportAttributionType] = jsonOf[ConversionReportAttributionType]
  implicit val ConversionReportAttributionTypeEncoder: EntityEncoder[ConversionReportAttributionType] = jsonEncoderOf[ConversionReportAttributionType]
}
