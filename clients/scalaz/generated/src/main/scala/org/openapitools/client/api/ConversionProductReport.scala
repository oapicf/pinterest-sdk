package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionProductReport._

case class ConversionProductReport (
  /* Message returned from the create report request */
  message: Option[String],
/* Async report status */
  reportStatus: Option[BulkReportingJobStatus],
/* Size of the report in bytes */
  size: Option[BigDecimal],
/* Token returned from the create report request */
  token: Option[String],
/* URL of the report */
  url: Option[String])

object ConversionProductReport {
  import DateTimeCodecs._

  implicit val ConversionProductReportCodecJson: CodecJson[ConversionProductReport] = CodecJson.derive[ConversionProductReport]
  implicit val ConversionProductReportDecoder: EntityDecoder[ConversionProductReport] = jsonOf[ConversionProductReport]
  implicit val ConversionProductReportEncoder: EntityEncoder[ConversionProductReport] = jsonEncoderOf[ConversionProductReport]
}
