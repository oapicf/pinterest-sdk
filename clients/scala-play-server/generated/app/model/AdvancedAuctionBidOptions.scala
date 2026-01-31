package model

import play.api.libs.json._

/**
  * Object describing a retail catalog item's bid options (bid price and bid multipliers).
  * @param bidInMicroCurrency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionBidOptions(
  bidInMicroCurrency: Option[Long],
  appTypeMultipliers: Option[AppTypeMultipliers],
  placementMultipliers: Option[PlacementMultipliers]
)

object AdvancedAuctionBidOptions {
  implicit lazy val advancedAuctionBidOptionsJsonFormat: Format[AdvancedAuctionBidOptions] = Json.format[AdvancedAuctionBidOptions]
}

