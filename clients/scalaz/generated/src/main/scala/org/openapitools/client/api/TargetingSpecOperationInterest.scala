package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationInterest._

case class TargetingSpecOperationInterest (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationInterest {
  import DateTimeCodecs._
  sealed trait Field
  case object INTEREST extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "INTEREST" => Some(INTEREST)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case INTEREST => "INTEREST"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationInterestCodecJson: CodecJson[TargetingSpecOperationInterest] = CodecJson.derive[TargetingSpecOperationInterest]
  implicit val TargetingSpecOperationInterestDecoder: EntityDecoder[TargetingSpecOperationInterest] = jsonOf[TargetingSpecOperationInterest]
  implicit val TargetingSpecOperationInterestEncoder: EntityEncoder[TargetingSpecOperationInterest] = jsonEncoderOf[TargetingSpecOperationInterest]
}
