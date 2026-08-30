@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MetricsResponse(
    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<MetricsResponseDataItems>? = null,

)
