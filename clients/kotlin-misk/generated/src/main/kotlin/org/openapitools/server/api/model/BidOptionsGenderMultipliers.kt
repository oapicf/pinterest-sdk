package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidOptionsGenderMultipliers(
    val female: java.math.BigDecimal? = null,
    val male: java.math.BigDecimal? = null
)
