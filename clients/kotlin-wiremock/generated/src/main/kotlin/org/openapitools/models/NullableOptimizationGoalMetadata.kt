@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class NullableOptimizationGoalMetadata(
    @field:JsonProperty("conversion_tag_v3_goal_metadata")
    val conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata? = null,

    @field:JsonProperty("frequency_goal_metadata")
    val frequencyGoalMetadata: FrequencyGoalMetadata? = null,

    @field:JsonProperty("scrollup_goal_metadata")
    val scrollupGoalMetadata: ScrollupGoalMetadata? = null,

)
