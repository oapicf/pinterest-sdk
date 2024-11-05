package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionProcessedItem._

case class AdvancedAuctionProcessedItem (
  operation: AdvancedAuctionOperation,
/* The catalog retail item id in the merchant namespace */
  itemId: String,
country: Country,
language: Language,
bidOptions: AdvancedAuctionBidOptions,
/* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. */
  updateMask: List[UpdateMaskBidOptionField],
/* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
  errors: Option[List[AdvancedAuctionOperationError]])

object AdvancedAuctionProcessedItem {
  import DateTimeCodecs._

  implicit val AdvancedAuctionProcessedItemCodecJson: CodecJson[AdvancedAuctionProcessedItem] = CodecJson.derive[AdvancedAuctionProcessedItem]
  implicit val AdvancedAuctionProcessedItemDecoder: EntityDecoder[AdvancedAuctionProcessedItem] = jsonOf[AdvancedAuctionProcessedItem]
  implicit val AdvancedAuctionProcessedItemEncoder: EntityEncoder[AdvancedAuctionProcessedItem] = jsonEncoderOf[AdvancedAuctionProcessedItem]
}
