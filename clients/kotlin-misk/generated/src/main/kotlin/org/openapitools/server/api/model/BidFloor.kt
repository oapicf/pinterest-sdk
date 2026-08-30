package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidFloor(
    /** A list of bid floors in micro currency. For example, [100000, 200000] */
    val bidFloors: kotlin.collections.List<kotlin.Int>? = null,
    /** Always the string &#39;bidfloor&#39;. */
    val type: kotlin.String? = "bidfloor"
)
