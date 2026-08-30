package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItemsSubmitUpsertRecord._

case class AdvancedAuctionItemsSubmitUpsertRecord (
  bidOptions: AdvancedAuctionBidOptions,
country: Country,
/* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
  errors: Option[List[AdvancedAuctionOperationError]],
/* The catalog retail item id in the merchant namespace */
  itemId: String,
language: Language,
operation: Operation,
/* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. */
  updateMask: List[UpdateMaskBidOptionField])

object AdvancedAuctionItemsSubmitUpsertRecord {
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

  implicit val AdvancedAuctionItemsSubmitUpsertRecordCodecJson: CodecJson[AdvancedAuctionItemsSubmitUpsertRecord] = CodecJson.derive[AdvancedAuctionItemsSubmitUpsertRecord]
  implicit val AdvancedAuctionItemsSubmitUpsertRecordDecoder: EntityDecoder[AdvancedAuctionItemsSubmitUpsertRecord] = jsonOf[AdvancedAuctionItemsSubmitUpsertRecord]
  implicit val AdvancedAuctionItemsSubmitUpsertRecordEncoder: EntityEncoder[AdvancedAuctionItemsSubmitUpsertRecord] = jsonEncoderOf[AdvancedAuctionItemsSubmitUpsertRecord]
}
