@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeaturedTrend(
    @field:JsonProperty("interest")
    val interest: InterestsEnum,

    @field:JsonProperty("market")
    val market: ProductCategoryRegion? = null,

    @field:JsonProperty("trends")
    val trends: kotlin.collections.List<TrendingTopic>? = null,

)
