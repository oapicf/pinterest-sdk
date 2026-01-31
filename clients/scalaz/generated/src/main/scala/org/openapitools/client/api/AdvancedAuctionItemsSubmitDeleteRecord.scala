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
/* The catalog retail item id in the merchant namespace */
  itemId: String,
language: Language,
/* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
  errors: Option[List[AdvancedAuctionOperationError]])

object AdvancedAuctionItemsSubmitDeleteRecord {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemsSubmitDeleteRecordCodecJson: CodecJson[AdvancedAuctionItemsSubmitDeleteRecord] = CodecJson.derive[AdvancedAuctionItemsSubmitDeleteRecord]
  implicit val AdvancedAuctionItemsSubmitDeleteRecordDecoder: EntityDecoder[AdvancedAuctionItemsSubmitDeleteRecord] = jsonOf[AdvancedAuctionItemsSubmitDeleteRecord]
  implicit val AdvancedAuctionItemsSubmitDeleteRecordEncoder: EntityEncoder[AdvancedAuctionItemsSubmitDeleteRecord] = jsonEncoderOf[AdvancedAuctionItemsSubmitDeleteRecord]
}
