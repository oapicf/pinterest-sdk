package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionProcessedItems._

case class AdvancedAuctionProcessedItems (
  /* Catalog id pertaining to all items */
  catalogId: Option[String],
/* Array of advanced auction processed items */
  items: Option[List[AdvancedAuctionProcessedItem]])

object AdvancedAuctionProcessedItems {
  import DateTimeCodecs._

  implicit val AdvancedAuctionProcessedItemsCodecJson: CodecJson[AdvancedAuctionProcessedItems] = CodecJson.derive[AdvancedAuctionProcessedItems]
  implicit val AdvancedAuctionProcessedItemsDecoder: EntityDecoder[AdvancedAuctionProcessedItems] = jsonOf[AdvancedAuctionProcessedItems]
  implicit val AdvancedAuctionProcessedItemsEncoder: EntityEncoder[AdvancedAuctionProcessedItems] = jsonEncoderOf[AdvancedAuctionProcessedItems]
}
