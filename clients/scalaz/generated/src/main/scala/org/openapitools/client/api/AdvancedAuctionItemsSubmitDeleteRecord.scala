package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItemsSubmitDeleteRecord._

case class AdvancedAuctionItemsSubmitDeleteRecord (
  country: Country,
/* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
  errors: Option[List[AdvancedAuctionOperationError]],
/* The catalog retail item id in the merchant namespace */
  itemId: String,
language: Language,
operation: Operation)

object AdvancedAuctionItemsSubmitDeleteRecord {
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

  implicit val AdvancedAuctionItemsSubmitDeleteRecordCodecJson: CodecJson[AdvancedAuctionItemsSubmitDeleteRecord] = CodecJson.derive[AdvancedAuctionItemsSubmitDeleteRecord]
  implicit val AdvancedAuctionItemsSubmitDeleteRecordDecoder: EntityDecoder[AdvancedAuctionItemsSubmitDeleteRecord] = jsonOf[AdvancedAuctionItemsSubmitDeleteRecord]
  implicit val AdvancedAuctionItemsSubmitDeleteRecordEncoder: EntityEncoder[AdvancedAuctionItemsSubmitDeleteRecord] = jsonEncoderOf[AdvancedAuctionItemsSubmitDeleteRecord]
}
