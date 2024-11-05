package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AppTypeMultipliers
import org.openapitools.model.PlacementMultipliers
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Object describing a retail catalog item's bid options (bid price and bid multipliers).
 * @param bidInMicroCurrency Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
 * @param appTypeMultipliers 
 * @param placementMultipliers 
 */
data class AdvancedAuctionBidOptions(

    @Schema(example = "5000000", description = "Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("app_type_multipliers") val appTypeMultipliers: AppTypeMultipliers? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("placement_multipliers") val placementMultipliers: PlacementMultipliers? = null
    ) {

}

