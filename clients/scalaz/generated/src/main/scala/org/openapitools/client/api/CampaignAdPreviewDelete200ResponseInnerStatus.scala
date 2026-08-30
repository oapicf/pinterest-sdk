package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignAdPreviewDelete200ResponseInnerStatus._

case class CampaignAdPreviewDelete200ResponseInnerStatus (
  statusCode: StatusCode,
code: Integer,
message: String)

object CampaignAdPreviewDelete200ResponseInnerStatus {
  import DateTimeCodecs._
  sealed trait StatusCode
  case object `204` extends StatusCode

  object StatusCode {
    def toStatusCode(s: String): Option[StatusCode] = s match {
      case "`204`" => Some(`204`)
      case _ => None
    }

    def fromStatusCode(x: StatusCode): String = x match {
      case `204` => "`204`"
    }
  }

  implicit val StatusCodeEnumEncoder: EncodeJson[StatusCode] =
    EncodeJson[StatusCode](is => StringEncodeJson(StatusCode.fromStatusCode(is)))

  implicit val StatusCodeEnumDecoder: DecodeJson[StatusCode] =
    DecodeJson.optionDecoder[StatusCode](n => n.string.flatMap(jStr => StatusCode.toStatusCode(jStr)), "StatusCode failed to de-serialize")

  implicit val CampaignAdPreviewDelete200ResponseInnerStatusCodecJson: CodecJson[CampaignAdPreviewDelete200ResponseInnerStatus] = CodecJson.derive[CampaignAdPreviewDelete200ResponseInnerStatus]
  implicit val CampaignAdPreviewDelete200ResponseInnerStatusDecoder: EntityDecoder[CampaignAdPreviewDelete200ResponseInnerStatus] = jsonOf[CampaignAdPreviewDelete200ResponseInnerStatus]
  implicit val CampaignAdPreviewDelete200ResponseInnerStatusEncoder: EntityEncoder[CampaignAdPreviewDelete200ResponseInnerStatus] = jsonEncoderOf[CampaignAdPreviewDelete200ResponseInnerStatus]
}
