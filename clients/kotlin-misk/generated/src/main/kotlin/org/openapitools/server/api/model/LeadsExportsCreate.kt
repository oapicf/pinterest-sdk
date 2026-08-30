package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadsExportsCreate(
    /** ID for the ad collecting leads. */
    val adId: kotlin.String,
    /** Export leads collected on and before end date (UTC). Format: YYYY-MM-DD. */
    val endDate: kotlin.String,
    /** Export leads collected on and after start date (UTC). Format: YYYY-MM-DD. */
    val startDate: kotlin.String
)
