package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetMMMReportResponseData._

case class GetMMMReportResponseData (
  reportStatus: Option[ReportStatus],
url: Option[String],
size: Option[BigDecimal])

object GetMMMReportResponseData {
  import DateTimeCodecs._
  sealed trait ReportStatus
  case object DOESNOTEXIST extends ReportStatus
  case object FINISHED extends ReportStatus
  case object INPROGRESS extends ReportStatus
  case object EXPIRED extends ReportStatus
  case object FAILED extends ReportStatus
  case object CANCELLED extends ReportStatus

  object ReportStatus {
    def toReportStatus(s: String): Option[ReportStatus] = s match {
      case "DOESNOTEXIST" => Some(DOESNOTEXIST)
      case "FINISHED" => Some(FINISHED)
      case "INPROGRESS" => Some(INPROGRESS)
      case "EXPIRED" => Some(EXPIRED)
      case "FAILED" => Some(FAILED)
      case "CANCELLED" => Some(CANCELLED)
      case _ => None
    }

    def fromReportStatus(x: ReportStatus): String = x match {
      case DOESNOTEXIST => "DOESNOTEXIST"
      case FINISHED => "FINISHED"
      case INPROGRESS => "INPROGRESS"
      case EXPIRED => "EXPIRED"
      case FAILED => "FAILED"
      case CANCELLED => "CANCELLED"
    }
  }

  implicit val ReportStatusEnumEncoder: EncodeJson[ReportStatus] =
    EncodeJson[ReportStatus](is => StringEncodeJson(ReportStatus.fromReportStatus(is)))

  implicit val ReportStatusEnumDecoder: DecodeJson[ReportStatus] =
    DecodeJson.optionDecoder[ReportStatus](n => n.string.flatMap(jStr => ReportStatus.toReportStatus(jStr)), "ReportStatus failed to de-serialize")

  implicit val GetMMMReportResponseDataCodecJson: CodecJson[GetMMMReportResponseData] = CodecJson.derive[GetMMMReportResponseData]
  implicit val GetMMMReportResponseDataDecoder: EntityDecoder[GetMMMReportResponseData] = jsonOf[GetMMMReportResponseData]
  implicit val GetMMMReportResponseDataEncoder: EntityEncoder[GetMMMReportResponseData] = jsonEncoderOf[GetMMMReportResponseData]
}
