@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupDeliveryEstimates(
    @field:JsonProperty("auto_targeting_enabled")
    val autoTargetingEnabled: kotlin.Boolean? = null,

    @field:JsonProperty("creative_types")
    val creativeTypes: kotlin.collections.List<AdGroupAudienceSizingCreativeTypes>? = null,

    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<AdGroupDeliveryEstimatesKeywordsItems>? = null,

    @field:JsonProperty("monthly_frequency_cap")
    val monthlyFrequencyCap: kotlin.Int? = null,

    @field:JsonProperty("optimization_goal_metadata")
    val optimizationGoalMetadata: OptimizationGoalMetadata? = null,

    @field:JsonProperty("optimization_type")
    val optimizationType: OptimizationType? = null,

    @field:JsonProperty("placement_group")
    val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,

    @field:JsonProperty("product_group_ids")
    val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("targeting_spec")
    val targetingSpec: TargetingSpecOptimal? = null,

)
