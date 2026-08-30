package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleBidOptionsPlacementMultipliers(
    /** Browse (home-feed and related surfaces) */
    val browse: kotlin.Double? = null,
    /** Related-Pins placement */
    val relatedPins: kotlin.Double? = null,
    /** Search placement */
    val search: kotlin.Double? = null
)
