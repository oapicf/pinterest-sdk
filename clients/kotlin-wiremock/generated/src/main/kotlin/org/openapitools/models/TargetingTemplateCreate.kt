@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingTemplateCreate(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("targeting_attributes")
    val targetingAttributes: TargetingSpecOptimal,

    @field:JsonProperty("auto_targeting_enabled")
    val autoTargetingEnabled: kotlin.Boolean? = true,

    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<TargetingTemplateKeyword>? = null,

    @field:JsonProperty("placement_group")
    val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: TrackingUrls? = null,

)
