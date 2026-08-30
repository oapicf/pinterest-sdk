@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedProductCounts(
    @field:JsonProperty("ingested")
    val ingested: kotlin.Int? = null,

    @field:JsonProperty("original")
    val original: kotlin.Int? = null,

)
