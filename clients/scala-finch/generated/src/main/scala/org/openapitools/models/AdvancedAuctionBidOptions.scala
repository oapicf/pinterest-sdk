package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AppTypeMultipliers
import org.openapitools.models.PlacementMultipliers

/**
 * Object describing a retail catalog item's bid options (bid price and bid multipliers).
 * @param bidUnderscoreinUnderscoremicroUnderscorecurrency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
 * @param appUnderscoretypeUnderscoremultipliers 
 * @param placementUnderscoremultipliers 
 */
case class AdvancedAuctionBidOptions(bidUnderscoreinUnderscoremicroUnderscorecurrency: Option[Long],
                appUnderscoretypeUnderscoremultipliers: Option[AppTypeMultipliers],
                placementUnderscoremultipliers: Option[PlacementMultipliers]
                )

object AdvancedAuctionBidOptions {
    /**
     * Creates the codec for converting AdvancedAuctionBidOptions from and to JSON.
     */
    implicit val decoder: Decoder[AdvancedAuctionBidOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdvancedAuctionBidOptions] = deriveEncoder
}
