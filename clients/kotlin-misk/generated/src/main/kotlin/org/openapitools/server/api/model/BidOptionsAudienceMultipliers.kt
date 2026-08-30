package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidOptionsAudienceMultipliers(
    val audienceId: kotlin.String,
    val multiplier: java.math.BigDecimal
)
