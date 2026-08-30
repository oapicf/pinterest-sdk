@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendingKeywordsResponse(
    @field:JsonProperty("trends")
    val trends: kotlin.collections.List<TrendingKeyword>? = null,

)
