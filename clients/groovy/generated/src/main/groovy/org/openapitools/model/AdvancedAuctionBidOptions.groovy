package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.PlacementMultipliers;

@Canonical
class AdvancedAuctionBidOptions {
    /* Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. */
    Long bidInMicroCurrency
    
    AppTypeMultipliers appTypeMultipliers
    
    PlacementMultipliers placementMultipliers
}
