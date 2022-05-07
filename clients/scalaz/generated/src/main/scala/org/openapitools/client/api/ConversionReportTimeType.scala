package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionReportTimeType._

case class ConversionReportTimeType (
  
object ConversionReportTimeType {
  import DateTimeCodecs._

  implicit val ConversionReportTimeTypeCodecJson: CodecJson[ConversionReportTimeType] = CodecJson.derive[ConversionReportTimeType]
  implicit val ConversionReportTimeTypeDecoder: EntityDecoder[ConversionReportTimeType] = jsonOf[ConversionReportTimeType]
  implicit val ConversionReportTimeTypeEncoder: EntityEncoder[ConversionReportTimeType] = jsonEncoderOf[ConversionReportTimeType]
}
