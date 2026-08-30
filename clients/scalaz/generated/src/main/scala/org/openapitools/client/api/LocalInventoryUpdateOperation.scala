package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryUpdateOperation._

case class LocalInventoryUpdateOperation (
  attributes: RetailLocalInventoryItemAttributesOptional,
/* Catalog item id in the merchant namespace */
  itemId: String,
operation: Operation,
/* Store code for the local inventory item */
  storeCode: String)

object LocalInventoryUpdateOperation {
  import DateTimeCodecs._
  sealed trait Operation
  case object UPDATE extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "UPDATE" => Some(UPDATE)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case UPDATE => "UPDATE"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val LocalInventoryUpdateOperationCodecJson: CodecJson[LocalInventoryUpdateOperation] = CodecJson.derive[LocalInventoryUpdateOperation]
  implicit val LocalInventoryUpdateOperationDecoder: EntityDecoder[LocalInventoryUpdateOperation] = jsonOf[LocalInventoryUpdateOperation]
  implicit val LocalInventoryUpdateOperationEncoder: EntityEncoder[LocalInventoryUpdateOperation] = jsonEncoderOf[LocalInventoryUpdateOperation]
}
