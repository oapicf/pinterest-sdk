package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignPlanningResponseErrorCode
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignPlanningResponseError(
    val code: CampaignPlanningResponseErrorCode? = null,
    /** Human-readable error message. */
    val message: kotlin.String? = null
)
