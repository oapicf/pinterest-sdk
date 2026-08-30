package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DynamicTitlesGetStatus(
    /** The count of generated titles. */
    val generatedCount: kotlin.Int? = null,
    /** Whether dynamic titles have been generated and are ready to be reviewed for the ad group. */
    val isReady: kotlin.Boolean? = null,
    /** The count of advertiser reviewed titles. */
    val reviewedCount: kotlin.Int? = null
)
