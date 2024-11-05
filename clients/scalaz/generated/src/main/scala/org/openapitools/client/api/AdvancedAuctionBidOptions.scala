package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvancedAuctionBidOptions._

case class AdvancedAuctionBidOptions (
  /* Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. */
  bidInMicroCurrency: Option[Long],
appTypeMultipliers: Option[AppTypeMultipliers],
placementMultipliers: Option[PlacementMultipliers])

object AdvancedAuctionBidOptions {
  import DateTimeCodecs._

  implicit val AdvancedAuctionBidOptionsCodecJson: CodecJson[AdvancedAuctionBidOptions] = CodecJson.derive[AdvancedAuctionBidOptions]
  implicit val AdvancedAuctionBidOptionsDecoder: EntityDecoder[AdvancedAuctionBidOptions] = jsonOf[AdvancedAuctionBidOptions]
  implicit val AdvancedAuctionBidOptionsEncoder: EntityEncoder[AdvancedAuctionBidOptions] = jsonEncoderOf[AdvancedAuctionBidOptions]
}
