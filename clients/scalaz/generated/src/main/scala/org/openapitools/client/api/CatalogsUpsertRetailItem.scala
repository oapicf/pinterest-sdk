package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsUpsertRetailItem._

case class CatalogsUpsertRetailItem (
  /* The catalog item id in the merchant namespace */
  itemId: String,
operation: Operation,
attributes: ItemAttributes)

object CatalogsUpsertRetailItem {
  import DateTimeCodecs._
  sealed trait Operation
  case object CREATE extends Operation
  case object UPDATE extends Operation
  case object UPSERT extends Operation
  case object DELETE extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "CREATE" => Some(CREATE)
      case "UPDATE" => Some(UPDATE)
      case "UPSERT" => Some(UPSERT)
      case "DELETE" => Some(DELETE)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case CREATE => "CREATE"
      case UPDATE => "UPDATE"
      case UPSERT => "UPSERT"
      case DELETE => "DELETE"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val CatalogsUpsertRetailItemCodecJson: CodecJson[CatalogsUpsertRetailItem] = CodecJson.derive[CatalogsUpsertRetailItem]
  implicit val CatalogsUpsertRetailItemDecoder: EntityDecoder[CatalogsUpsertRetailItem] = jsonOf[CatalogsUpsertRetailItem]
  implicit val CatalogsUpsertRetailItemEncoder: EntityEncoder[CatalogsUpsertRetailItem] = jsonEncoderOf[CatalogsUpsertRetailItem]
}
