package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreateRetailItem._

case class CatalogsCreateRetailItem (
  /* The catalog item id in the merchant namespace */
  itemId: String,
operation: Operation,
attributes: ItemAttributesRequest)

object CatalogsCreateRetailItem {
  import DateTimeCodecs._
  sealed trait Operation
  case object CREATE extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "CREATE" => Some(CREATE)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case CREATE => "CREATE"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val CatalogsCreateRetailItemCodecJson: CodecJson[CatalogsCreateRetailItem] = CodecJson.derive[CatalogsCreateRetailItem]
  implicit val CatalogsCreateRetailItemDecoder: EntityDecoder[CatalogsCreateRetailItem] = jsonOf[CatalogsCreateRetailItem]
  implicit val CatalogsCreateRetailItemEncoder: EntityEncoder[CatalogsCreateRetailItem] = jsonEncoderOf[CatalogsCreateRetailItem]
}
