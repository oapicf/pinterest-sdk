@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignDeliveryEstimatesDerivedMetrics(
    @field:JsonProperty("cpc")
    val cpc: kotlin.Float? = null,

    @field:JsonProperty("cpc_lower")
    val cpcLower: kotlin.Float? = null,

    @field:JsonProperty("cpc_upper")
    val cpcUpper: kotlin.Float? = null,

    @field:JsonProperty("cpm")
    val cpm: kotlin.Float? = null,

    @field:JsonProperty("cpm_lower")
    val cpmLower: kotlin.Float? = null,

    @field:JsonProperty("cpm_upper")
    val cpmUpper: kotlin.Float? = null,

    @field:JsonProperty("lifetime_frequency")
    val lifetimeFrequency: kotlin.Float? = null,

    @field:JsonProperty("lifetime_frequency_lower")
    val lifetimeFrequencyLower: kotlin.Float? = null,

    @field:JsonProperty("lifetime_frequency_upper")
    val lifetimeFrequencyUpper: kotlin.Float? = null,

    @field:JsonProperty("lifetime_impression")
    val lifetimeImpression: kotlin.Float? = null,

    @field:JsonProperty("lifetime_impression_lower")
    val lifetimeImpressionLower: kotlin.Float? = null,

    @field:JsonProperty("lifetime_impression_upper")
    val lifetimeImpressionUpper: kotlin.Float? = null,

    @field:JsonProperty("lifetime_reach")
    val lifetimeReach: kotlin.Float? = null,

    @field:JsonProperty("lifetime_reach_lower")
    val lifetimeReachLower: kotlin.Float? = null,

    @field:JsonProperty("lifetime_reach_upper")
    val lifetimeReachUpper: kotlin.Float? = null,

    @field:JsonProperty("weekly_click")
    val weeklyClick: kotlin.Float? = null,

    @field:JsonProperty("weekly_click_lower")
    val weeklyClickLower: kotlin.Float? = null,

    @field:JsonProperty("weekly_click_upper")
    val weeklyClickUpper: kotlin.Float? = null,

    @field:JsonProperty("weekly_frequency")
    val weeklyFrequency: kotlin.Float? = null,

    @field:JsonProperty("weekly_frequency_lower")
    val weeklyFrequencyLower: kotlin.Float? = null,

    @field:JsonProperty("weekly_frequency_upper")
    val weeklyFrequencyUpper: kotlin.Float? = null,

    @field:JsonProperty("weekly_impression")
    val weeklyImpression: kotlin.Float? = null,

    @field:JsonProperty("weekly_impression_lower")
    val weeklyImpressionLower: kotlin.Float? = null,

    @field:JsonProperty("weekly_impression_upper")
    val weeklyImpressionUpper: kotlin.Float? = null,

    @field:JsonProperty("weekly_reach")
    val weeklyReach: kotlin.Float? = null,

    @field:JsonProperty("weekly_reach_lower")
    val weeklyReachLower: kotlin.Float? = null,

    @field:JsonProperty("weekly_reach_upper")
    val weeklyReachUpper: kotlin.Float? = null,

)
