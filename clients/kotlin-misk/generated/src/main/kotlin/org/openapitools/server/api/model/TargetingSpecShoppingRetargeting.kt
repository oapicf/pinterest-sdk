package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingSpecShoppingRetargeting(
    /** Number of days ago to stop lookback timeframe for dynamic retargeting */
    val exclusionWindow: kotlin.Int? = null,
    /** Number of days ago to start lookback timeframe for dynamic retargeting */
    val lookbackWindow: kotlin.Int? = null,
    /** Event types to target for dynamic retargeting */
    val tagTypes: kotlin.collections.List<kotlin.Int>? = null
)
