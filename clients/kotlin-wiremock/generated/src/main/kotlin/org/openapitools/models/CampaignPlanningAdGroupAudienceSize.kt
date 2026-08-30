@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningAdGroupAudienceSize(
    @field:JsonProperty("count_lower")
    val countLower: kotlin.Int? = null,

    @field:JsonProperty("count_upper")
    val countUpper: kotlin.Int? = null,

)
