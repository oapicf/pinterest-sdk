@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedProcessingResultsList200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<CatalogsFeedProcessingResult>,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

)
