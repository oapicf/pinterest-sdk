@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingTemplate(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("targeting_attributes")
    val targetingAttributes: TargetingSpecOptimal,

    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("auto_targeting_enabled")
    val autoTargetingEnabled: kotlin.Boolean? = true,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<TargetingTemplateKeyword>? = null,

    @field:JsonProperty("placement_group")
    val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,

    @field:JsonProperty("sizing")
    val sizing: TargetingTemplateAudienceSizing? = null,

    @field:JsonProperty("status")
    val status: TargetingTemplateStatus? = null,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: TrackingUrls? = null,

    @field:JsonProperty("updated_time")
    val updatedTime: kotlin.Int? = null,

    @field:JsonProperty("valid")
    val valid: kotlin.Boolean? = null,

)
