@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidFloorSpec(
    @field:JsonProperty("billable_event")
    val billableEvent: ActionType,

    @field:JsonProperty("currency")
    val currency: Currency,

    @field:JsonProperty("countries")
    val countries: kotlin.collections.List<Country>? = null,

    @field:JsonProperty("creative_type")
    val creativeType: CreativeType? = null,

    @field:JsonProperty("objective_type")
    val objectiveType: BidFloorObjectiveType? = null,

    @field:JsonProperty("optimization_goal_metadata")
    val optimizationGoalMetadata: OptimizationGoalMetadata? = null,

)
