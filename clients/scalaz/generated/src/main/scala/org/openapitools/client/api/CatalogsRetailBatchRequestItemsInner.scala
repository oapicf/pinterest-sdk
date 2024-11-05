package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailBatchRequestItemsInner._

case class CatalogsRetailBatchRequestItemsInner (
  /* The catalog item id in the merchant namespace */
  itemId: String,
operation: Operation,
attributes: ItemAttributesRequest,
/* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
  updateMask: Option[List[UpdateMaskFieldType]])

object CatalogsRetailBatchRequestItemsInner {
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

  implicit val CatalogsRetailBatchRequestItemsInnerCodecJson: CodecJson[CatalogsRetailBatchRequestItemsInner] = CodecJson.derive[CatalogsRetailBatchRequestItemsInner]
  implicit val CatalogsRetailBatchRequestItemsInnerDecoder: EntityDecoder[CatalogsRetailBatchRequestItemsInner] = jsonOf[CatalogsRetailBatchRequestItemsInner]
  implicit val CatalogsRetailBatchRequestItemsInnerEncoder: EntityEncoder[CatalogsRetailBatchRequestItemsInner] = jsonEncoderOf[CatalogsRetailBatchRequestItemsInner]
}
