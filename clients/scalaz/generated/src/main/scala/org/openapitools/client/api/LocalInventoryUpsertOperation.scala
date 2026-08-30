package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryUpsertOperation._

case class LocalInventoryUpsertOperation (
  attributes: RetailLocalInventoryItemAttributes,
/* Catalog item id in the merchant namespace */
  itemId: String,
operation: Operation,
/* Store code for the local inventory item */
  storeCode: String)

object LocalInventoryUpsertOperation {
  import DateTimeCodecs._
  sealed trait Operation
  case object UPSERT extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "UPSERT" => Some(UPSERT)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case UPSERT => "UPSERT"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val LocalInventoryUpsertOperationCodecJson: CodecJson[LocalInventoryUpsertOperation] = CodecJson.derive[LocalInventoryUpsertOperation]
  implicit val LocalInventoryUpsertOperationDecoder: EntityDecoder[LocalInventoryUpsertOperation] = jsonOf[LocalInventoryUpsertOperation]
  implicit val LocalInventoryUpsertOperationEncoder: EntityEncoder[LocalInventoryUpsertOperation] = jsonEncoderOf[LocalInventoryUpsertOperation]
}
