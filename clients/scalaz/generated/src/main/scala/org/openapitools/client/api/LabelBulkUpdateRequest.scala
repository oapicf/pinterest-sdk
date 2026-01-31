package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelBulkUpdateRequest._

case class LabelBulkUpdateRequest (
  /* Label ID. */
  id: String,
/* Set status to `ARCHIVED` to remove the label from the parent entity. */
  status: Option[Status],
/* </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit. */
  value: Option[String])

object LabelBulkUpdateRequest {
  import DateTimeCodecs._
  sealed trait Status
  case object ARCHIVED extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "ARCHIVED" => Some(ARCHIVED)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case ARCHIVED => "ARCHIVED"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val LabelBulkUpdateRequestCodecJson: CodecJson[LabelBulkUpdateRequest] = CodecJson.derive[LabelBulkUpdateRequest]
  implicit val LabelBulkUpdateRequestDecoder: EntityDecoder[LabelBulkUpdateRequest] = jsonOf[LabelBulkUpdateRequest]
  implicit val LabelBulkUpdateRequestEncoder: EntityEncoder[LabelBulkUpdateRequest] = jsonEncoderOf[LabelBulkUpdateRequest]
}
