package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateUpdateRequest._

case class TargetingTemplateUpdateRequest (
  operationType: OperationType,
/* Targeting template ID */
  id: String)

object TargetingTemplateUpdateRequest {
  import DateTimeCodecs._
  sealed trait OperationType
  case object REMOVE extends OperationType

  object OperationType {
    def toOperationType(s: String): Option[OperationType] = s match {
      case "REMOVE" => Some(REMOVE)
      case _ => None
    }

    def fromOperationType(x: OperationType): String = x match {
      case REMOVE => "REMOVE"
    }
  }

  implicit val OperationTypeEnumEncoder: EncodeJson[OperationType] =
    EncodeJson[OperationType](is => StringEncodeJson(OperationType.fromOperationType(is)))

  implicit val OperationTypeEnumDecoder: DecodeJson[OperationType] =
    DecodeJson.optionDecoder[OperationType](n => n.string.flatMap(jStr => OperationType.toOperationType(jStr)), "OperationType failed to de-serialize")

  implicit val TargetingTemplateUpdateRequestCodecJson: CodecJson[TargetingTemplateUpdateRequest] = CodecJson.derive[TargetingTemplateUpdateRequest]
  implicit val TargetingTemplateUpdateRequestDecoder: EntityDecoder[TargetingTemplateUpdateRequest] = jsonOf[TargetingTemplateUpdateRequest]
  implicit val TargetingTemplateUpdateRequestEncoder: EntityEncoder[TargetingTemplateUpdateRequest] = jsonEncoderOf[TargetingTemplateUpdateRequest]
}
