package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsReport._

case class CatalogsReport (
  reportStatus: Option[ReportStatus],
/* URL to download the report */
  url: Option[String],
/* Size of the report in bytes */
  size: Option[BigDecimal])

object CatalogsReport {
  import DateTimeCodecs._
  sealed trait ReportStatus
  case object FINISHED extends ReportStatus
  case object INPROGRESS extends ReportStatus

  object ReportStatus {
    def toReportStatus(s: String): Option[ReportStatus] = s match {
      case "FINISHED" => Some(FINISHED)
      case "INPROGRESS" => Some(INPROGRESS)
      case _ => None
    }

    def fromReportStatus(x: ReportStatus): String = x match {
      case FINISHED => "FINISHED"
      case INPROGRESS => "INPROGRESS"
    }
  }

  implicit val ReportStatusEnumEncoder: EncodeJson[ReportStatus] =
    EncodeJson[ReportStatus](is => StringEncodeJson(ReportStatus.fromReportStatus(is)))

  implicit val ReportStatusEnumDecoder: DecodeJson[ReportStatus] =
    DecodeJson.optionDecoder[ReportStatus](n => n.string.flatMap(jStr => ReportStatus.toReportStatus(jStr)), "ReportStatus failed to de-serialize")

  implicit val CatalogsReportCodecJson: CodecJson[CatalogsReport] = CodecJson.derive[CatalogsReport]
  implicit val CatalogsReportDecoder: EntityDecoder[CatalogsReport] = jsonOf[CatalogsReport]
  implicit val CatalogsReportEncoder: EntityEncoder[CatalogsReport] = jsonEncoderOf[CatalogsReport]
}
