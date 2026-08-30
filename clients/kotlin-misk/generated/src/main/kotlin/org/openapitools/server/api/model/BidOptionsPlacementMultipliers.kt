package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidOptionsPlacementMultipliers(
    val browse: java.math.BigDecimal? = null,
    val relatedPins: java.math.BigDecimal? = null,
    val search: java.math.BigDecimal? = null
)
