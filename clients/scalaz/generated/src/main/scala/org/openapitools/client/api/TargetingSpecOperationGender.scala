package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationGender._

case class TargetingSpecOperationGender (
  field: Field,
operation: TargetingSpecListOperation,
values: List[TargetingSpecGender])

object TargetingSpecOperationGender {
  import DateTimeCodecs._
  sealed trait Field
  case object GENDER extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "GENDER" => Some(GENDER)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case GENDER => "GENDER"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationGenderCodecJson: CodecJson[TargetingSpecOperationGender] = CodecJson.derive[TargetingSpecOperationGender]
  implicit val TargetingSpecOperationGenderDecoder: EntityDecoder[TargetingSpecOperationGender] = jsonOf[TargetingSpecOperationGender]
  implicit val TargetingSpecOperationGenderEncoder: EntityEncoder[TargetingSpecOperationGender] = jsonEncoderOf[TargetingSpecOperationGender]
}
