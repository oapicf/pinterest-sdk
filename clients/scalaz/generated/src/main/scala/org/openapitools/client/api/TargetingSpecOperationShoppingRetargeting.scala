package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationShoppingRetargeting._

case class TargetingSpecOperationShoppingRetargeting (
  field: Field,
operation: Operation,
values: List[TargetingSpecShoppingRetargeting])

object TargetingSpecOperationShoppingRetargeting {
  import DateTimeCodecs._
  sealed trait Field
  case object SHOPPINGRETARGETING extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "SHOPPINGRETARGETING" => Some(SHOPPINGRETARGETING)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case SHOPPINGRETARGETING => "SHOPPINGRETARGETING"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")
  sealed trait Operation
  case object SET extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "SET" => Some(SET)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case SET => "SET"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val TargetingSpecOperationShoppingRetargetingCodecJson: CodecJson[TargetingSpecOperationShoppingRetargeting] = CodecJson.derive[TargetingSpecOperationShoppingRetargeting]
  implicit val TargetingSpecOperationShoppingRetargetingDecoder: EntityDecoder[TargetingSpecOperationShoppingRetargeting] = jsonOf[TargetingSpecOperationShoppingRetargeting]
  implicit val TargetingSpecOperationShoppingRetargetingEncoder: EntityEncoder[TargetingSpecOperationShoppingRetargeting] = jsonEncoderOf[TargetingSpecOperationShoppingRetargeting]
}
