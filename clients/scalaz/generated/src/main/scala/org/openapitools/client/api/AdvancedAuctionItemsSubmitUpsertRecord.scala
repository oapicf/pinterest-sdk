package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionItemsSubmitUpsertRecord._

case class AdvancedAuctionItemsSubmitUpsertRecord (
  /* The catalog retail item id in the merchant namespace */
  itemId: String,
country: Country,
language: Language,
bidOptions: AdvancedAuctionBidOptions,
/* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. */
  updateMask: List[UpdateMaskBidOptionField])

object AdvancedAuctionItemsSubmitUpsertRecord {
  import DateTimeCodecs._

  implicit val AdvancedAuctionItemsSubmitUpsertRecordCodecJson: CodecJson[AdvancedAuctionItemsSubmitUpsertRecord] = CodecJson.derive[AdvancedAuctionItemsSubmitUpsertRecord]
  implicit val AdvancedAuctionItemsSubmitUpsertRecordDecoder: EntityDecoder[AdvancedAuctionItemsSubmitUpsertRecord] = jsonOf[AdvancedAuctionItemsSubmitUpsertRecord]
  implicit val AdvancedAuctionItemsSubmitUpsertRecordEncoder: EntityEncoder[AdvancedAuctionItemsSubmitUpsertRecord] = jsonEncoderOf[AdvancedAuctionItemsSubmitUpsertRecord]
}
