@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignPlanningPointEstimate(
    @field:JsonProperty("budget")
    val budget: kotlin.Int,

    @field:JsonProperty("double_y")
    val doubleY: kotlin.Double,

    @field:JsonProperty("max_y")
    val maxY: kotlin.Int,

    @field:JsonProperty("min_y")
    val minY: kotlin.Int,

    @field:JsonProperty("y")
    val y: kotlin.Int,

)
