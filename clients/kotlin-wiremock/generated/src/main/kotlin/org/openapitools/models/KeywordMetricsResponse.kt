@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordMetricsResponse(
    @field:JsonProperty("keyword")
    val keyword: kotlin.String? = null,

    @field:JsonProperty("metrics")
    val metrics: KeywordMetrics? = null,

)
