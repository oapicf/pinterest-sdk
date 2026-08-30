@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerSegmentList200Response(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<CustomerSegment>,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

)
