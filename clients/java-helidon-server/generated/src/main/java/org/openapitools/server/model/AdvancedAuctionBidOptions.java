package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AppTypeMultipliers;
import org.openapitools.server.model.PlacementMultipliers;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing a retail catalog item's bid options (bid price and bid multipliers).
 */
public class AdvancedAuctionBidOptions   {

    private AppTypeMultipliers appTypeMultipliers;
    private Long bidInMicroCurrency;
    private PlacementMultipliers placementMultipliers;

    /**
     * Default constructor.
     */
    public AdvancedAuctionBidOptions() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvancedAuctionBidOptions.
     *
     * @param appTypeMultipliers appTypeMultipliers
     * @param bidInMicroCurrency Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.
     * @param placementMultipliers placementMultipliers
     */
    public AdvancedAuctionBidOptions(
        AppTypeMultipliers appTypeMultipliers, 
        Long bidInMicroCurrency, 
        PlacementMultipliers placementMultipliers
    ) {
        this.appTypeMultipliers = appTypeMultipliers;
        this.bidInMicroCurrency = bidInMicroCurrency;
        this.placementMultipliers = placementMultipliers;
    }



    /**
     * Get appTypeMultipliers
     * @return appTypeMultipliers
     */
    public AppTypeMultipliers getAppTypeMultipliers() {
        return appTypeMultipliers;
    }

    public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
        this.appTypeMultipliers = appTypeMultipliers;
    }

    /**
     * Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
     * @return bidInMicroCurrency
     */
    public Long getBidInMicroCurrency() {
        return bidInMicroCurrency;
    }

    public void setBidInMicroCurrency(Long bidInMicroCurrency) {
        this.bidInMicroCurrency = bidInMicroCurrency;
    }

    /**
     * Get placementMultipliers
     * @return placementMultipliers
     */
    public PlacementMultipliers getPlacementMultipliers() {
        return placementMultipliers;
    }

    public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
        this.placementMultipliers = placementMultipliers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedAuctionBidOptions {\n");
        
        sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
        sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
        sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

