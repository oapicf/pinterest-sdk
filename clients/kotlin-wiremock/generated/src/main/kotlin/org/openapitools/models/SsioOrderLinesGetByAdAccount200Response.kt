@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SsioOrderLinesGetByAdAccount200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<SSIOOrderLine>,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

)
