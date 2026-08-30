package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationAppType._

case class TargetingSpecOperationAppType (
  field: Field,
operation: TargetingSpecListOperation,
values: List[TargetingSpecAppType])

object TargetingSpecOperationAppType {
  import DateTimeCodecs._
  sealed trait Field
  case object APPTYPE extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "APPTYPE" => Some(APPTYPE)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case APPTYPE => "APPTYPE"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationAppTypeCodecJson: CodecJson[TargetingSpecOperationAppType] = CodecJson.derive[TargetingSpecOperationAppType]
  implicit val TargetingSpecOperationAppTypeDecoder: EntityDecoder[TargetingSpecOperationAppType] = jsonOf[TargetingSpecOperationAppType]
  implicit val TargetingSpecOperationAppTypeEncoder: EntityEncoder[TargetingSpecOperationAppType] = jsonEncoderOf[TargetingSpecOperationAppType]
}
