package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsDeleteHotelItem._

case class CatalogsDeleteHotelItem (
  /* The catalog hotel id in the merchant namespace */
  hotelId: String,
operation: Operation)

object CatalogsDeleteHotelItem {
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

  implicit val CatalogsDeleteHotelItemCodecJson: CodecJson[CatalogsDeleteHotelItem] = CodecJson.derive[CatalogsDeleteHotelItem]
  implicit val CatalogsDeleteHotelItemDecoder: EntityDecoder[CatalogsDeleteHotelItem] = jsonOf[CatalogsDeleteHotelItem]
  implicit val CatalogsDeleteHotelItemEncoder: EntityEncoder[CatalogsDeleteHotelItem] = jsonEncoderOf[CatalogsDeleteHotelItem]
}
