package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsUpsertHotelItem._

case class CatalogsUpsertHotelItem (
  /* The catalog hotel id in the merchant namespace */
  hotelId: String,
operation: Operation,
attributes: CatalogsHotelAttributes)

object CatalogsUpsertHotelItem {
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

  implicit val CatalogsUpsertHotelItemCodecJson: CodecJson[CatalogsUpsertHotelItem] = CodecJson.derive[CatalogsUpsertHotelItem]
  implicit val CatalogsUpsertHotelItemDecoder: EntityDecoder[CatalogsUpsertHotelItem] = jsonOf[CatalogsUpsertHotelItem]
  implicit val CatalogsUpsertHotelItemEncoder: EntityEncoder[CatalogsUpsertHotelItem] = jsonEncoderOf[CatalogsUpsertHotelItem]
}
