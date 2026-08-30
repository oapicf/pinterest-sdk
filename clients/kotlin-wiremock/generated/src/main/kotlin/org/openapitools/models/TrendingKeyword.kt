@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendingKeyword(
    @field:JsonProperty("demographics")
    val demographics: TrendingKeywordDemographics? = null,

    @field:JsonProperty("has_prediction")
    val hasPrediction: kotlin.Boolean? = null,

    @field:JsonProperty("keyword")
    val keyword: kotlin.String? = null,

    @field:JsonProperty("pct_growth_mom")
    val pctGrowthMom: kotlin.Int? = null,

    @field:JsonProperty("pct_growth_wow")
    val pctGrowthWow: kotlin.Int? = null,

    @field:JsonProperty("pct_growth_yoy")
    val pctGrowthYoy: kotlin.Int? = null,

    @field:JsonProperty("predicted_time_series")
    val predictedTimeSeries: PredictedTimeSeries? = null,

    @field:JsonProperty("time_series")
    val timeSeries: TimeSeries? = null,

)
