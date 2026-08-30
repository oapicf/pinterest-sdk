@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidOptionsAudienceMultipliers(
    @field:JsonProperty("audience_id")
    val audienceId: kotlin.String,

    @field:JsonProperty("multiplier")
    val multiplier: java.math.BigDecimal,

)
