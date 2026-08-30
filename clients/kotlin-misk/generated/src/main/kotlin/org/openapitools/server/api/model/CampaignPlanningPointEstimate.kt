package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningPointEstimate(
    /** The budget value of the point. */
    val budget: kotlin.Int,
    /** Y value as a decimal. */
    val doubleY: kotlin.Double,
    /** The maximum Y value of the point. */
    val maxY: kotlin.Int,
    /** The minimum Y value of the point. */
    val minY: kotlin.Int,
    /** The expected Y value of the point. */
    val y: kotlin.Int
)
