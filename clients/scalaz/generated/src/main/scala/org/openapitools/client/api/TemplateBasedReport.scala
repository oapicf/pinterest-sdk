package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplateBasedReport._

case class TemplateBasedReport (
  message: Option[String],
reportStatus: BulkReportingJobStatus,
/* Unique identifier of a template. */
  templateId: String,
token: Option[String])

object TemplateBasedReport {
  import DateTimeCodecs._

  implicit val TemplateBasedReportCodecJson: CodecJson[TemplateBasedReport] = CodecJson.derive[TemplateBasedReport]
  implicit val TemplateBasedReportDecoder: EntityDecoder[TemplateBasedReport] = jsonOf[TemplateBasedReport]
  implicit val TemplateBasedReportEncoder: EntityEncoder[TemplateBasedReport] = jsonEncoderOf[TemplateBasedReport]
}
