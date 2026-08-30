@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendingTopic(
    @field:JsonProperty("description")
    val description: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("pins")
    val pins: kotlin.collections.List<TrendingPin>,

    @field:JsonProperty("related_interests")
    val relatedInterests: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("related_searches")
    val relatedSearches: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("time_series")
    val timeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,

    @field:JsonProperty("title")
    val title: kotlin.String,

    @field:JsonProperty("percent_growth_mom")
    val percentGrowthMom: kotlin.Int? = null,

)
