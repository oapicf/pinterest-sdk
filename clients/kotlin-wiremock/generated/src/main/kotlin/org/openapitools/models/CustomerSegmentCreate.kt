@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerSegmentCreate(
    @field:JsonProperty("audience_ids")
    val audienceIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
