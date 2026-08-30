@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupAudienceSizingCreate(
    @field:JsonProperty("auto_targeting_enabled")
    val autoTargetingEnabled: kotlin.Boolean? = true,

    @field:JsonProperty("creative_types")
    val creativeTypes: kotlin.collections.List<AdGroupAudienceSizingCreativeTypes>? = null,

    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<AdGroupAudienceSizingKeyword>? = null,

    @field:JsonProperty("placement_group")
    val placementGroup: AdgroupPlacementGroupType? = null,

    @field:JsonProperty("product_group_ids")
    val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("targeting_spec")
    val targetingSpec: TargetingSpecOptimal? = null,

)
