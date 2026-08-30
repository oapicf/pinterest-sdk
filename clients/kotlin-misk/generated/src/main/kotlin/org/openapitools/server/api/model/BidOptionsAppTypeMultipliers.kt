package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidOptionsAppTypeMultipliers(
    val androidMobile: java.math.BigDecimal? = null,
    val androidTablet: java.math.BigDecimal? = null,
    val ipad: java.math.BigDecimal? = null,
    val iphone: java.math.BigDecimal? = null,
    val web: java.math.BigDecimal? = null,
    val webMobile: java.math.BigDecimal? = null
)
