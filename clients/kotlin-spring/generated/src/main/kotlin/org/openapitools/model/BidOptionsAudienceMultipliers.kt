package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 * @param audienceId 
 * @param multiplier 
 */
data class BidOptionsAudienceMultipliers(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "")
    @param:JsonProperty("audience_id")
    @get:JsonProperty("audience_id", required = true) val audienceId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("multiplier")
    @get:JsonProperty("multiplier", required = true) val multiplier: java.math.BigDecimal
) {

}

