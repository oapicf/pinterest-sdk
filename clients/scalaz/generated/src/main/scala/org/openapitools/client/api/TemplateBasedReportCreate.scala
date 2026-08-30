package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplateBasedReportCreate._

case class TemplateBasedReportCreate (
  message: Option[String],
reportStatus: BulkReportingJobStatus,
token: Option[String])

object TemplateBasedReportCreate {
  import DateTimeCodecs._

  implicit val TemplateBasedReportCreateCodecJson: CodecJson[TemplateBasedReportCreate] = CodecJson.derive[TemplateBasedReportCreate]
  implicit val TemplateBasedReportCreateDecoder: EntityDecoder[TemplateBasedReportCreate] = jsonOf[TemplateBasedReportCreate]
  implicit val TemplateBasedReportCreateEncoder: EntityEncoder[TemplateBasedReportCreate] = jsonEncoderOf[TemplateBasedReportCreate]
}
