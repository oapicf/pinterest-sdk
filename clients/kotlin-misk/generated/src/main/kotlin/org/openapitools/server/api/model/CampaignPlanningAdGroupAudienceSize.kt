package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningAdGroupAudienceSize(
    /** Lower bound of the audience size estimate. */
    val countLower: kotlin.Int? = null,
    /** Upper bound of the audience size estimate. */
    val countUpper: kotlin.Int? = null
)
