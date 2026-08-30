@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AudienceRule(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("ad_id")
    val adId: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("campaign_id")
    val campaignId: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("country")
    val country: kotlin.String? = null,

    @field:JsonProperty("customer_list_id")
    val customerListId: kotlin.String? = null,

    @field:JsonProperty("engagement_domain")
    val engagementDomain: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("engagement_type")
    val engagementType: kotlin.String? = null,

    @field:JsonProperty("engager_type")
    val engagerType: kotlin.Int? = null,

    @field:JsonProperty("event")
    val event: kotlin.String? = null,

    @field:JsonProperty("event_data")
    val eventData: EventData? = null,

    @field:JsonProperty("event_source")
    val eventSource: kotlin.Any? = null,

    @field:JsonProperty("ingestion_source")
    val ingestionSource: kotlin.Any? = null,

    @field:JsonProperty("objective_type")
    val objectiveType: kotlin.collections.List<ObjectiveType>? = null,

    @field:JsonProperty("percentage")
    val percentage: kotlin.Int? = null,

    @field:JsonProperty("pin_id")
    val pinId: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("prefill")
    val prefill: kotlin.Boolean? = null,

    @field:JsonProperty("retention_days")
    val retentionDays: kotlin.Int? = null,

    @field:JsonProperty("seed_id")
    val seedId: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("url")
    val url: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("visitor_source_id")
    val visitorSourceId: kotlin.String? = null,

)
