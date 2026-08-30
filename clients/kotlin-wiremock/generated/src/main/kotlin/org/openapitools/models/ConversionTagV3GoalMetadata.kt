@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionTagV3GoalMetadata(
    @field:JsonProperty("attribution_windows")
    val attributionWindows: AttributionWindows? = null,

    @field:JsonProperty("conversion_event")
    val conversionEvent: ConversionEvent? = null,

    @field:JsonProperty("conversion_tag_id")
    val conversionTagId: kotlin.String? = null,

    @field:JsonProperty("cpa_goal_value_in_micro_currency")
    val cpaGoalValueInMicroCurrency: kotlin.String? = null,

    @field:JsonProperty("is_roas_optimized")
    val isRoasOptimized: kotlin.Boolean? = null,

    @field:JsonProperty("reporting_event")
    val reportingEvent: kotlin.String? = null,

)
