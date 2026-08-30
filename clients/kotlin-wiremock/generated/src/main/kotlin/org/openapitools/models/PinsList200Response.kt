@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinsList200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<Pin>,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

)
