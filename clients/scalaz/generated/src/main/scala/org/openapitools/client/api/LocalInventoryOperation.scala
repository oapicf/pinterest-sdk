package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryOperation._

case class LocalInventoryOperation (
  attributes: RetailLocalInventoryItemAttributes,
/* Catalog item id in the merchant namespace */
  itemId: String,
operation: Operation,
/* Store code for the local inventory item */
  storeCode: String)

object LocalInventoryOperation {
  import DateTimeCodecs._
  sealed trait Operation
  case object DELETE extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "DELETE" => Some(DELETE)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case DELETE => "DELETE"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val LocalInventoryOperationCodecJson: CodecJson[LocalInventoryOperation] = CodecJson.derive[LocalInventoryOperation]
  implicit val LocalInventoryOperationDecoder: EntityDecoder[LocalInventoryOperation] = jsonOf[LocalInventoryOperation]
  implicit val LocalInventoryOperationEncoder: EntityEncoder[LocalInventoryOperation] = jsonEncoderOf[LocalInventoryOperation]
}
