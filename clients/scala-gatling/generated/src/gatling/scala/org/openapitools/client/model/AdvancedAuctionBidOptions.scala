
package org.openapitools.client.model


case class AdvancedAuctionBidOptions (
    /* Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. */
    _bidInMicroCurrency: Option[Long],
    _appTypeMultipliers: Option[AppTypeMultipliers],
    _placementMultipliers: Option[PlacementMultipliers]
)
object AdvancedAuctionBidOptions {
    def toStringBody(var_bidInMicroCurrency: Object, var_appTypeMultipliers: Object, var_placementMultipliers: Object) =
        s"""
        | {
        | "bidInMicroCurrency":$var_bidInMicroCurrency,"appTypeMultipliers":$var_appTypeMultipliers,"placementMultipliers":$var_placementMultipliers
        | }
        """.stripMargin
}
