package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationList._

case class TargetingSpecOperationList (
  field: String,
operation: Operation,
values: List[String])

object TargetingSpecOperationList {
  import DateTimeCodecs._
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

  implicit val TargetingSpecOperationListCodecJson: CodecJson[TargetingSpecOperationList] = CodecJson.derive[TargetingSpecOperationList]
  implicit val TargetingSpecOperationListDecoder: EntityDecoder[TargetingSpecOperationList] = jsonOf[TargetingSpecOperationList]
  implicit val TargetingSpecOperationListEncoder: EntityEncoder[TargetingSpecOperationList] = jsonEncoderOf[TargetingSpecOperationList]
}
