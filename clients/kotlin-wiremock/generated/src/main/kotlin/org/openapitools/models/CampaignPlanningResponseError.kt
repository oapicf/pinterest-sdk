@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningResponseError(
    @field:JsonProperty("code")
    val code: CampaignPlanningResponseErrorCode? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

)
