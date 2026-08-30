package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignDeliveryEstimatesDerivedMetrics(
    /** Estimated cost per click. */
    val cpc: kotlin.Float? = null,
    /** Lower estimate of the cost per click. */
    val cpcLower: kotlin.Float? = null,
    /** Upper estimate of the cost per click. */
    val cpcUpper: kotlin.Float? = null,
    /** Estimated cost per thousand impressions. */
    val cpm: kotlin.Float? = null,
    /** Lower estimate of cost per thousand impressions. */
    val cpmLower: kotlin.Float? = null,
    /** Upper estimate of cost per thousand impressions. */
    val cpmUpper: kotlin.Float? = null,
    /** Estimated lifetime frequency. */
    val lifetimeFrequency: kotlin.Float? = null,
    /** Lower estimate of lifetime frequency. */
    val lifetimeFrequencyLower: kotlin.Float? = null,
    /** Upper estimate of lifetime frequency. */
    val lifetimeFrequencyUpper: kotlin.Float? = null,
    /** Estimated lifetime impressions. */
    val lifetimeImpression: kotlin.Float? = null,
    /** Lower estimate of lifetime impressions. */
    val lifetimeImpressionLower: kotlin.Float? = null,
    /** Upper estimate of lifetime impressions. */
    val lifetimeImpressionUpper: kotlin.Float? = null,
    /** Estimated lifetime reach. */
    val lifetimeReach: kotlin.Float? = null,
    /** Lower estimate of lifetime reach. */
    val lifetimeReachLower: kotlin.Float? = null,
    /** Upper estimate of lifetime reach. */
    val lifetimeReachUpper: kotlin.Float? = null,
    /** Estimated weekly clicks. */
    val weeklyClick: kotlin.Float? = null,
    /** Lower estimate of weekly clicks. */
    val weeklyClickLower: kotlin.Float? = null,
    /** Upper estimate of weekly clicks. */
    val weeklyClickUpper: kotlin.Float? = null,
    /** Estimated weekly frequency. */
    val weeklyFrequency: kotlin.Float? = null,
    /** Lower estimate of weekly frequency. */
    val weeklyFrequencyLower: kotlin.Float? = null,
    /** Upper estimate of weekly frequency. */
    val weeklyFrequencyUpper: kotlin.Float? = null,
    /** Estimated weekly impressions. */
    val weeklyImpression: kotlin.Float? = null,
    /** Lower estimate of weekly impressions. */
    val weeklyImpressionLower: kotlin.Float? = null,
    /** Upper estimate of weekly impressions. */
    val weeklyImpressionUpper: kotlin.Float? = null,
    /** Estimated weekly reach. */
    val weeklyReach: kotlin.Float? = null,
    /** Lower estimate of weekly reach. */
    val weeklyReachLower: kotlin.Float? = null,
    /** Upper estimate of weekly reach. */
    val weeklyReachUpper: kotlin.Float? = null
)
