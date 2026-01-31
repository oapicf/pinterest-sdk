package org.openapitools.server.model


/**
 * Object describing a retail catalog item's bid options (bid price and bid multipliers).
 *
 * @param appTypeMultipliers  for example: ''null''
 * @param bidInMicroCurrency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. for example: ''5000000''
 * @param placementMultipliers  for example: ''null''
*/
final case class AdvancedAuctionBidOptions (
  appTypeMultipliers: Option[AppTypeMultipliers] = None,
  bidInMicroCurrency: Option[Long] = None,
  placementMultipliers: Option[PlacementMultipliers] = None
)

