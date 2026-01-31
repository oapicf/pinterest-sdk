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
operation: Operation,
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
  sealed trait Operation
  case object SET extends Operation
  case object ADD extends Operation
  case object REMOVE extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "SET" => Some(SET)
      case "ADD" => Some(ADD)
      case "REMOVE" => Some(REMOVE)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case SET => "SET"
      case ADD => "ADD"
      case REMOVE => "REMOVE"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val TargetingSpecOperationGenderCodecJson: CodecJson[TargetingSpecOperationGender] = CodecJson.derive[TargetingSpecOperationGender]
  implicit val TargetingSpecOperationGenderDecoder: EntityDecoder[TargetingSpecOperationGender] = jsonOf[TargetingSpecOperationGender]
  implicit val TargetingSpecOperationGenderEncoder: EntityEncoder[TargetingSpecOperationGender] = jsonEncoderOf[TargetingSpecOperationGender]
}
