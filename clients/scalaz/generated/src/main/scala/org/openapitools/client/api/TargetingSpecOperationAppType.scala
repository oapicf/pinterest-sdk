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
operation: Operation,
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

  implicit val TargetingSpecOperationAppTypeCodecJson: CodecJson[TargetingSpecOperationAppType] = CodecJson.derive[TargetingSpecOperationAppType]
  implicit val TargetingSpecOperationAppTypeDecoder: EntityDecoder[TargetingSpecOperationAppType] = jsonOf[TargetingSpecOperationAppType]
  implicit val TargetingSpecOperationAppTypeEncoder: EntityEncoder[TargetingSpecOperationAppType] = jsonEncoderOf[TargetingSpecOperationAppType]
}
