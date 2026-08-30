package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Derived metrics for an ad campaign.
 * @param cpc Estimated cost per click.
 * @param cpcLower Lower estimate of the cost per click.
 * @param cpcUpper Upper estimate of the cost per click.
 * @param cpm Estimated cost per thousand impressions.
 * @param cpmLower Lower estimate of cost per thousand impressions.
 * @param cpmUpper Upper estimate of cost per thousand impressions.
 * @param lifetimeFrequency Estimated lifetime frequency.
 * @param lifetimeFrequencyLower Lower estimate of lifetime frequency.
 * @param lifetimeFrequencyUpper Upper estimate of lifetime frequency.
 * @param lifetimeImpression Estimated lifetime impressions.
 * @param lifetimeImpressionLower Lower estimate of lifetime impressions.
 * @param lifetimeImpressionUpper Upper estimate of lifetime impressions.
 * @param lifetimeReach Estimated lifetime reach.
 * @param lifetimeReachLower Lower estimate of lifetime reach.
 * @param lifetimeReachUpper Upper estimate of lifetime reach.
 * @param weeklyClick Estimated weekly clicks.
 * @param weeklyClickLower Lower estimate of weekly clicks.
 * @param weeklyClickUpper Upper estimate of weekly clicks.
 * @param weeklyFrequency Estimated weekly frequency.
 * @param weeklyFrequencyLower Lower estimate of weekly frequency.
 * @param weeklyFrequencyUpper Upper estimate of weekly frequency.
 * @param weeklyImpression Estimated weekly impressions.
 * @param weeklyImpressionLower Lower estimate of weekly impressions.
 * @param weeklyImpressionUpper Upper estimate of weekly impressions.
 * @param weeklyReach Estimated weekly reach.
 * @param weeklyReachLower Lower estimate of weekly reach.
 * @param weeklyReachUpper Upper estimate of weekly reach.
 */
data class CampaignDeliveryEstimatesDerivedMetrics(

    @Schema(example = "0.56", description = "Estimated cost per click.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpc")
    @get:JsonProperty("cpc") val cpc: kotlin.Float? = null,

    @Schema(example = "0.47", description = "Lower estimate of the cost per click.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpc_lower")
    @get:JsonProperty("cpc_lower") val cpcLower: kotlin.Float? = null,

    @Schema(example = "0.65", description = "Upper estimate of the cost per click.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpc_upper")
    @get:JsonProperty("cpc_upper") val cpcUpper: kotlin.Float? = null,

    @Schema(example = "10", description = "Estimated cost per thousand impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpm")
    @get:JsonProperty("cpm") val cpm: kotlin.Float? = null,

    @Schema(example = "8", description = "Lower estimate of cost per thousand impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpm_lower")
    @get:JsonProperty("cpm_lower") val cpmLower: kotlin.Float? = null,

    @Schema(example = "12", description = "Upper estimate of cost per thousand impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpm_upper")
    @get:JsonProperty("cpm_upper") val cpmUpper: kotlin.Float? = null,

    @Schema(description = "Estimated lifetime frequency.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_frequency")
    @get:JsonProperty("lifetime_frequency") val lifetimeFrequency: kotlin.Float? = null,

    @Schema(description = "Lower estimate of lifetime frequency.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_frequency_lower")
    @get:JsonProperty("lifetime_frequency_lower") val lifetimeFrequencyLower: kotlin.Float? = null,

    @Schema(description = "Upper estimate of lifetime frequency.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_frequency_upper")
    @get:JsonProperty("lifetime_frequency_upper") val lifetimeFrequencyUpper: kotlin.Float? = null,

    @Schema(description = "Estimated lifetime impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_impression")
    @get:JsonProperty("lifetime_impression") val lifetimeImpression: kotlin.Float? = null,

    @Schema(description = "Lower estimate of lifetime impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_impression_lower")
    @get:JsonProperty("lifetime_impression_lower") val lifetimeImpressionLower: kotlin.Float? = null,

    @Schema(description = "Upper estimate of lifetime impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_impression_upper")
    @get:JsonProperty("lifetime_impression_upper") val lifetimeImpressionUpper: kotlin.Float? = null,

    @Schema(description = "Estimated lifetime reach.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_reach")
    @get:JsonProperty("lifetime_reach") val lifetimeReach: kotlin.Float? = null,

    @Schema(description = "Lower estimate of lifetime reach.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_reach_lower")
    @get:JsonProperty("lifetime_reach_lower") val lifetimeReachLower: kotlin.Float? = null,

    @Schema(description = "Upper estimate of lifetime reach.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_reach_upper")
    @get:JsonProperty("lifetime_reach_upper") val lifetimeReachUpper: kotlin.Float? = null,

    @Schema(example = "1000", description = "Estimated weekly clicks.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_click")
    @get:JsonProperty("weekly_click") val weeklyClick: kotlin.Float? = null,

    @Schema(example = "800", description = "Lower estimate of weekly clicks.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_click_lower")
    @get:JsonProperty("weekly_click_lower") val weeklyClickLower: kotlin.Float? = null,

    @Schema(example = "1200", description = "Upper estimate of weekly clicks.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_click_upper")
    @get:JsonProperty("weekly_click_upper") val weeklyClickUpper: kotlin.Float? = null,

    @Schema(example = "3", description = "Estimated weekly frequency.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_frequency")
    @get:JsonProperty("weekly_frequency") val weeklyFrequency: kotlin.Float? = null,

    @Schema(example = "2.5", description = "Lower estimate of weekly frequency.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_frequency_lower")
    @get:JsonProperty("weekly_frequency_lower") val weeklyFrequencyLower: kotlin.Float? = null,

    @Schema(example = "3.5", description = "Upper estimate of weekly frequency.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_frequency_upper")
    @get:JsonProperty("weekly_frequency_upper") val weeklyFrequencyUpper: kotlin.Float? = null,

    @Schema(example = "400000", description = "Estimated weekly impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_impression")
    @get:JsonProperty("weekly_impression") val weeklyImpression: kotlin.Float? = null,

    @Schema(example = "350000", description = "Lower estimate of weekly impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_impression_lower")
    @get:JsonProperty("weekly_impression_lower") val weeklyImpressionLower: kotlin.Float? = null,

    @Schema(example = "450000", description = "Upper estimate of weekly impressions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_impression_upper")
    @get:JsonProperty("weekly_impression_upper") val weeklyImpressionUpper: kotlin.Float? = null,

    @Schema(example = "102074.85050444445", description = "Estimated weekly reach.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_reach")
    @get:JsonProperty("weekly_reach") val weeklyReach: kotlin.Float? = null,

    @Schema(example = "90000", description = "Lower estimate of weekly reach.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_reach_lower")
    @get:JsonProperty("weekly_reach_lower") val weeklyReachLower: kotlin.Float? = null,

    @Schema(example = "150000", description = "Upper estimate of weekly reach.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("weekly_reach_upper")
    @get:JsonProperty("weekly_reach_upper") val weeklyReachUpper: kotlin.Float? = null
) {

}

